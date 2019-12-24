package AnnotationExample;

import annotation.Employee;
import annotation.Normalize;

import java.lang.reflect.Field;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("",1);
        //
        //trả ra 1 danh sách các thuộc tính imployee
        Field[] fields = student.getClass().getDeclaredFields();
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
                    if(fields[i].get(student) == null) {
                        System.out.println("Null");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
