import java.util.List;
import java.util.Collections;

public class TargetTypeExample {
    static <T> List<T> emptyList() {
        return Collections.emptyList();
    }

    void processStringList(List<String> stringList) {
        // Xử lý danh sách các chuỗi
    }

    public static void main(String[] args) {
        TargetTypeExample example = new TargetTypeExample();

        // Kiểu đích được suy luận là List<String>
        List<String> list = emptyList();
        
        // Kiểu đích của list được truyền vào phương thức
        example.processStringList(list);
    }
}
