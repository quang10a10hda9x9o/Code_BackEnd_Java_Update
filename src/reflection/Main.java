package reflection;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Girl girl = new Girl(); // Khoi tao doi tuong Girl
        girl.setName("Ngoc Trinh");
        girl.setName1("dsfsg Trin");
        girl.setName2("Ngoc Trfdgfdginh");
        girl.setName3("Ngoc fdgdfTrinh");
        girl.setName4("Ngoc Trinh");
        girl.setName5("sdfas Trinh");
        girl.setName6(1);
        girl.setName7(2);
        girl.setName8(3);
        girl.setName9(4);
        girl.setName10(5);
        //Lấy tất cả filed của object
        //kiểu dữ liệu là Field
        for(Field field : girl.getClass().getDeclaredFields()) {
            System.out.println();
            System.out.println("File: " + field.getName());
            System.out.println("Type: " + field.getType());
        }

        for(Field field : girl.getClass().getDeclaredFields()) {
            if(field.getType().getTypeName().equals("java.lang.String")) {
                field.setAccessible(true);
                field.set(girl,"Ngọc Trinh");
            }
        }
        //Phần chính
        Field nameField = girl.getClass().getDeclaredField("name"); // Lấy ra file có tên "name"
        nameField.setAccessible(true);//Cho phép truy cập tạm thời (vì nó đang là private)

        //bây giờ cái "nameField" đại diện thuộc tính "name" của mọi object có class Girl
//        nameField.set(girl,"Bella"); // thay giá trị mới của 'girl' bằng nameField
        System.out.println(girl);

        System.out.println("_____________");


    }
}
