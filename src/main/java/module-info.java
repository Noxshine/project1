module huyhoang { // tên module này là package mà ta viết tất cả mã nguonf liên quan đến javafx :>
    // hoặc là cần dùng các module khác thì xác định trong này rồi export đến các package khác
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens huyhoang to javafx.fxml;
    exports huyhoang;

}