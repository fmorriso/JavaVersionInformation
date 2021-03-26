public class JavaVersionInformation
{

    public static void main(String[] args)
    {
        String version = System.getProperty("java.version");
        System.out.println("java.version=" + version);
        version = System.getProperty("java.specification.version");
        System.out.println("java.specification.version=" + version);
        version = System.getProperty("java.runtime.version");
        System.out.println("java.runtime.version=" + version);
        // Runtime.Version only works for JDK 9 and newer
        Runtime.Version runTimeVersion = Runtime.version();
        System.out.println("RunTime.Version=" + runTimeVersion);
        System.out.println("RunTime.Version.feature()=" + runTimeVersion.feature()); // major version
    }
}
