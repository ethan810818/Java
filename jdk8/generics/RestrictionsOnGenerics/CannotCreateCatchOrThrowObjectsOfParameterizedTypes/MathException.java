package generics.RestrictionsOnGenerics.CannotCreateCatchOrThrowObjectsOfParameterizedTypes;

import java.io.File;

class Parser<T extends Exception> {
  public void parse(File file) throws T {     // OK
      // ...
  }
}
