package com.phucpd.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
//          REFACTORING, REFACTOR: TỐI ƯU, TINH CHỈNH SOURCE CODE
//          CODE MỚI KHI ĐƯỢC ĐƯA LÊN SERVER, PHẢI ĐƯỢC CHECK LẠI NGAY Ở NHÁNH DEV, HOẶC KHI ĐƯA VÀO
//          NHÁNH MAIN THÌ CŨNG PHẢI ĐƯỢC CHECK ĐỂ ĐẢM BẢO RẰNG NÓ MÀU XANH, PASSED CÁC TEST CASE
//          LÝ DO: HÀM THÌ PHẢI CHẠY ĐÚNG
            //NẾU PROJECT CÓ SẴN TDD, UNIT TEST, THÌ QUÁ TRÌNH KIỂM THỬ LẠI CODE VỪA SỬA DIỄN RA RẤT NHANH, RẤT TIỆN DO CÓ UNIT TEST
        // PHỐI HỢP VỚI CI SCRIPT (.YML) SẼ TỰ ĐỘNG ĐƯỢC RUN VÀ TỰ BÁO MÀU XANH VÀ GỬI MAIL NẾU CÓ MÀU ĐỎ
        //TEST LẠI THỨ ĐÃ TỪNG TEST ĐỂ CHẮC CHẦN RẰNG NÓ VẪN CÒN ỔN SAU KHI ĐC SỬA ĐC GỌI LÀ
        //KIỂM THỬ HỒI QUY - REGRESSION TESTING
        //TA CHỈNH CODE DÙNG ĐỆ QUY - RECURSION


        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(
                    "Invalid parameter. n must be between 0 and 20"
            );
        }

        if (n == 0 || n == 1 ) {
            return 1; //n=0  hay 1 return ngay điểm dừng của đệ quy
        }

        //đệ quy ,recursion, gọi lại chính mình ở đây
        return n * getFactorial(n - 1);
        // n! = n * (n - 1)!


//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException(
//                    "Invalid parameter. n must be between 0 and 20"
//            );
//        }
//
//        if (n == 0 ) {
//            return 1;
//        }
//        long result = 1;   //Khởi đầu với giai thừa bằng ...
//                            // Code bị lỗi giai thừa tăng lên 10
//        //Sửa lại source thành 1 để ok trở lại green forever
//        for (int i = 1; i <= n; i++) {
//            result *= i;
//        }
//
//        return result;
    }
}