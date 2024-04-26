package NumberAndStrings.strings;

public class Filename {
    private String fullPath;
    private char pathSeparator, extensionSeparator;

    public Filename(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator); //gán chỉ mục vị trí xuất hiện lần cuối cùng của '.' trong fullPath cho dot
        return fullPath.substring(dot + 1); //trả về chuỗi con của fullPath, bắt đầu từ chỉ mục(doc + 1) cho đến hết chuỗi fullPath, kết quả sẽ là: 'html'
    }

    //get filename without extension
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator); //gán chỉ mục vị trí xuất hiện lần cuối cùng của '/' trong fullPath
        return fullPath.substring(sep + 1, dot); // trả về chuỗi con của fullPath bắt đầu từ i(sep+1) đến trước dấu '.'(là x), kết quả sẽ là: 'index'
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);// gán chỉ mục vị trí xuất hiện cuối cùng của '/' trong fullPath cho sep
        return fullPath.substring(0, sep);// trả về chuỗi con của fullPath, bắt đầu từ:0 -> sep, kết quả trả về sẽ là 'C:/Users/Admin/Desktop/a'
    }
}
