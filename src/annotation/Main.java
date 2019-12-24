package annotation;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Q$***&&&ua1324ngewrewr","123***fsdf");
        //
        //trả ra 1 danh sách các thuộc tính imployee
        Field[] fields = employee.getClass().getDeclaredFields();
        //truy cập vào các field xem có annotation nào là Normalize này k
        //Duyệt các phần tử của mảng
        for(int i=0 ; i<fields.length ; i++) {
            //Tạo biến
            Normalize normalize = fields[i].getAnnotation(Normalize.class);
            if(normalize != null) {
                //Bắt lỗi (Try ... Catch)
                try {
                    //Cho phép truy cập thuộc tính hiện tại
                    fields[i].setAccessible(true);
                    //lấy giá trị của field có giá trị(true) nhảy vào vòng lặp sai thì bỏ qua
                    if(fields[i].get(employee) != null) {
                        fields[i].set(employee,String.valueOf(fields[i].get(employee)).replaceAll("[^A-Za-z0-9]",""));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        System.out.println(employee);
    }
}
