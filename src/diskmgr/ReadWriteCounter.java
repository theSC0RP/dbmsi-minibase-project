package diskmgr;
public class ReadWriteCounter {
  public static int readCount = 0;
  public static int writeCount = 0;

  public static void init() {
    readCount = 0;
    writeCount = 0;
  }

  public static void incrementReadCount() {
    readCount++;
  }

  public static void incrementWriteCount() {
    writeCount++;
  }

  public static int getReadCount() {
    return readCount;
  }

  public static int getWriteCount() {
    return writeCount;
  }
}
