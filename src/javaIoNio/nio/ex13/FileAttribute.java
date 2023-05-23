package javaIoNio.nio.ex13;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.List;
import java.util.Set;

/**
 * @author Serhii Klunniy
 */
public class FileAttribute {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("D:\\projectsJAVA\\Practice\\src\\javaIoNio\\nio\\ex13\\test.txt");

        System.out.println("Size " + Files.size(path));
        System.out.println("Date modified " + Files.getLastModifiedTime(path));
        System.out.println("Is writable " + Files.isWritable(path));

        //FileStore - это репрезентация нашего файлового хранилища, например логического диска
        FileStore fileStore = Files.getFileStore(path);
//        System.out.println(fileStore.getTotalSpace());
//        System.out.println("Type " + fileStore.type());

        validateView (fileStore, BasicFileAttributeView.class);
        validateView (fileStore, DosFileAttributeView.class);
        validateView (fileStore, PosixFileAttributeView.class);
        validateView (fileStore, AclFileAttributeView.class);
        validateView (fileStore, UserDefinedFileAttributeView.class);
        validateView (fileStore, FileOwnerAttributeView.class);

//        1. BasicFileAttributeView - этот набор атрибутов поддерживается всеми операционными системами
//        2. DosFileAttributeView - windows
//        3. PosixFileAttributeView - no windows, read hart, centos, ubunty
//        4. AclFileAttributeView - позволяет управлять правами доступа к файлам и папкам на платформе windows
//        5. UserDefinedFileAttributeView
//        6. FileOwnerAttributeView

//        DosFileAttributes dosFileAttributes = Files.readAttributes(path, DosFileAttributes.class);
//        System.out.println("Creation time " + dosFileAttributes.creationTime());
//        System.out.println("Is hidden " + dosFileAttributes.isHidden());

//        Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rwx------");
//        java.nio.file.attribute.FileAttribute<Set<PosixFilePermission>> setFileAttribute = PosixFilePermissions.asFileAttribute(posixFilePermissions);
//        Files.createFile(Paths.get("file1.txt"), setFileAttribute);

        UserPrincipal user = path.getFileSystem().getUserPrincipalLookupService().lookupPrincipalByName("Sergey");
        AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
        AclEntry acl = AclEntry.newBuilder()
                .setType(AclEntryType.ALLOW)
                .setPrincipal(user)
                .setPermissions(AclEntryPermission.READ_ATTRIBUTES, AclEntryPermission.READ_DATA)
                .build();
        List<AclEntry> acl1 = view.getAcl();
        acl1.add(acl);
        view.setAcl(acl1);

    }

    private static void validateView(FileStore fileStore, Class<? extends FileAttributeView> viewClass) {
        boolean supports = fileStore.supportsFileAttributeView(viewClass);
        System.out.println("supports " + viewClass.getSimpleName() + " " +  supports);
    }

}
