package reflection1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        //Khởi tạo đối tượng Girl
        Girl girl = new Girl();
        girl.setName("Ngọc trinh");

        //Lấy ra tất cả field của object
        for(Field field : girl.getClass().getDeclaredFields()) {
            System.out.println();
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType());
        }

        //PHẦN CHÍNH
        //Lấy ra field có tên là "name"
        Field nameField = girl.getClass().getDeclaredField("name");
        //Cho phép truy cập tạm thời vì nó đang là private
        nameField.setAccessible(true);
        //Bây giờ cái nameFiled đại diện cho cái name của mọi object có class Girl
        //Thay giá trị mới của "girl" là nameFiled
        nameField.set(girl,"Bella");
        System.out.println(girl);
    }
}
