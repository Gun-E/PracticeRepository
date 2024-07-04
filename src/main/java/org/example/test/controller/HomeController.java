package org.example.test.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.example.test.domain.AddressDTO;
import org.example.test.domain.CartDto;
import org.example.test.domain.CategoryDTO;
import org.example.test.domain.DiscountDTO;
import org.example.test.domain.NoticeDetailDto;
import org.example.test.domain.NoticeDto;
import org.example.test.domain.OrderDetailDto;
import org.example.test.domain.OrderListDto;
import org.example.test.domain.ProductDTO;
import org.example.test.domain.ProductDetailDTO;
import org.example.test.domain.ProductListDTO;
import org.example.test.domain.ProductRegistrationDTO;
import org.example.test.domain.TagDTO;
import org.example.test.domain.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model) {
        List<ProductListDTO> products = new ArrayList<>();

        products.add(new ProductListDTO(1L, "noddle.jpg", "삼양", "삼양라면 5 + 1개입", "1box",5000, 5000));
        products.add(new ProductListDTO(1L, "라면박스.jpg", "삼양", "삼양라면 1 박스", "1box", 5000, 50000));
        products.add(new ProductListDTO(1L, "당근.jpg", "국내산", "당근", "1개", 5000, 100));
        products.add(new ProductListDTO(1L, "농심)김치사발면.png", "국내산", "한우 A++", "500g",5000,  9999999));
        products.add(new ProductListDTO(1L, "농심)새우탕컵.png", "삼양", "삼양라면 5 + 1개입", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)신라면컵.jpg", "삼양", "삼양라면 5 + 1개입", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)안성탕면(멀티팩).jpg", "삼양", "삼양라면 5 + 1개입 testestsetsets", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)오징어짬뽕컵.jpg", "삼양", "삼양라면 5 + 1개입", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "삼양)불닭볶음면멀티.jpg", "삼양", "삼양라면 5 + 1개입", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "오뚜기)진라면-소컵(순한맛).jpg", "삼양", "삼양라면 5 + 1개입", "1box",5000,  5000));
        products.add(new ProductListDTO(1L, "팔도)왕뚜껑.jpg", "삼양", "삼양라면 5 + 1개입", "1box",5000,  5000));
        model.addAttribute("starredProducts", products);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "product-list-starred");
        return "layout";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "admin-management");
        return "layout";
    }

    @GetMapping("/user/{id}")
    public String myPage(@PathVariable int id, Model model) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(id);
        userDTO.setName("홍길동");
        userDTO.setPhone("010-1234-5678");
        userDTO.setEmail("hong@example.com");
        userDTO.setCompanyName("ABC 주식회사");
        userDTO.setZipcode("62010");
        userDTO.setAddress("광주광역시 서구 서광주로 28");
        userDTO.setDetailAddress("Y-Mart");

        model.addAttribute("userId", 1);
        model.addAttribute("user", userDTO);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-detail");
        return "layout";
    }

    @GetMapping("/notice")
    public String noticePage(Model model) {
        List<NoticeDto> notices = new ArrayList<>();
        notices.add(new NoticeDto(1L, LocalDateTime.of(2024, 3, 1, 0, 0), "🦾 새로운 기능 추가되었습니다.", "관리자1"));
        notices.add(new NoticeDto(1L, LocalDateTime.of(2024, 3, 2, 0, 0), "🖥️ 서버 점검 안내입니다.", "관리자2"));
        notices.add(new NoticeDto(1L, LocalDateTime.of(2024, 3, 3, 0, 0), "✏️ 이용약관이 변경되었습니다.", "관리자3"));
        notices.add(new NoticeDto(1L, LocalDateTime.of(2024, 3, 4, 0, 0), "😘 회원가입 이벤트가 진행 중입니다.", "관리자4"));
        notices.add(new NoticeDto(1L, LocalDateTime.of(2024, 3, 4, 0, 0), "😘 회원가입 이벤트가 진행 중입니다.", "관리자4"));

        model.addAttribute("userId", 1);
        model.addAttribute("notices", notices);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "notice");

        return "layout";
    }

    @GetMapping("/notice/{id}")
    public String showNoticeDetail(@PathVariable Long id, Model model) {

        NoticeDetailDto noticeDetailDto = new NoticeDetailDto(
                id,
                "새로운 기능 추가 안내",
                "저희 서비스에 새로운 기능이 추가되었습니다. 이제 더 많은 기능을 이용하실 수 있습니다.",
                "관리자",
                LocalDate.of(2024, 3, 17)
        );

        model.addAttribute("notice_detail", noticeDetailDto);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "notice_detail");
        model.addAttribute("userId", 1);

        return "layout";
    }

    @GetMapping("/noticeRegistration")
    public String showNoticeRegistration(Model model) {
        NoticeDetailDto noticeDTO = new NoticeDetailDto();
        model.addAttribute("noticeDTO", noticeDTO);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "notice_management");
        return "layout";
    }

    @GetMapping("/noticeModify/{id}")
    public String showNoticeModify(@PathVariable Long id, Model model) {
        NoticeDetailDto noticeDTO = new NoticeDetailDto(
                id,
                "새로운 기능 추가 안내",
                "저희 서비스에 새로운 기능이 추가되었습니다. 이제 더 많은 기능을 이용하실 수 있습니다.",
                "관리자",
                LocalDate.of(2024, 2, 17)
        );
        model.addAttribute("noticeDTO", noticeDTO);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "notice_management");
        return "layout";
    }

    @GetMapping("/product/list")
    public String allPage(Model model) {
        List<ProductListDTO> products = new ArrayList<>();

        products.add(new ProductListDTO(1L, "noddle.jpg", "삼양", "삼양라면 5 + 1개입", "1box",5000, 5000));
        products.add(new ProductListDTO(1L, "라면박스.jpg", "삼양", "삼양라면 1 박스", "1box", 5000, 50000));
        products.add(new ProductListDTO(1L, "당근.jpg", "국내산", "당근", "1개", 5000, 500000));
        products.add(new ProductListDTO(1L, "농심)김치사발면.png", "국내산", "한우 A++", "500g",5000,  999999));
        products.add(new ProductListDTO(1L, "농심)새우탕컵.jpg", "농심", "새우탕컵", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)신라면컵.jpg", "농심", "신라면컵", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)안성탕면(멀티팩).jpg", "농심", "안성탕면(멀티팩)", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)오징어짬뽕컵.jpg", "농심", "오징어짬뽕컵", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "삼양)불닭볶음면멀티.jpg", "삼양", "불닭볶음면멀티", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "오뚜기)진라면-소컵(순한맛).jpg", "오뚜기", "진라면-소컵(순한맛)", "1box",5000,  5000));
        products.add(new ProductListDTO(1L, "팔도)왕뚜껑.jpg", "팔도", "왕뚜껑", "1box",5000,  5000));

        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(new CategoryDTO(1, "채소 • 과일"));
        categories.add(new CategoryDTO(2, "쌀 • 잡곡 • 견과"));
        categories.add(new CategoryDTO(3, "축산 • 계란류"));
        categories.add(new CategoryDTO(4, "생선 • 해산물"));
        categories.add(new CategoryDTO(5, "냉장 • 냉동 간편식"));
        categories.add(new CategoryDTO(6, "반찬류"));
        categories.add(new CategoryDTO(7, "소스 • 양념"));
        categories.add(new CategoryDTO(8, "장류 • 조미료"));
        categories.add(new CategoryDTO(9, "캔 • 통조림"));
        categories.add(new CategoryDTO(10, "면류 • 가공식품"));
        categories.add(new CategoryDTO(11, "스낵 • 안주류"));
        categories.add(new CategoryDTO(12, "액체류"));
        categories.add(new CategoryDTO(13, "일반용품"));
        categories.add(new CategoryDTO(14, "주방용품"));
        categories.add(new CategoryDTO(15, "포장용기 • 일회용품"));

        model.addAttribute("categories", categories);
        model.addAttribute("cartCount", 12);
        model.addAttribute("products", products);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "product-list");
        return "layout";
    }

    @GetMapping("/category/{id}")
    public String categoryPage(@PathVariable int id, Model model) {
        List<ProductListDTO> products = new ArrayList<>();

        products.add(new ProductListDTO(1L, "noddle.jpg", "삼양", "삼양라면 5 + 1개입", "1box",5000, 5000));
        products.add(new ProductListDTO(1L, "라면박스.jpg", "삼양", "삼양라면 1 박스", "1box", 5000, 50000));
        products.add(new ProductListDTO(1L, "당근.jpg", "국내산", "당근", "1개", 5000, 100));
        products.add(new ProductListDTO(1L, "농심)김치사발면.png", "국내산", "한우 A++", "500g",5000,  9999999));
        products.add(new ProductListDTO(1L, "농심)새우탕컵.jpg", "농심", "새우탕컵", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)신라면컵.jpg", "농심", "신라면컵", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)안성탕면(멀티팩).jpg", "농심", "안성탕면(멀티팩)", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "농심)오징어짬뽕컵.jpg", "농심", "오징어짬뽕컵", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "삼양)불닭볶음면멀티.jpg", "삼양", "불닭볶음면멀티", "1box", 5000, 5000));
        products.add(new ProductListDTO(1L, "오뚜기)진라면-소컵(순한맛).jpg", "오뚜기", "진라면-소컵(순한맛)", "1box",5000,  5000));
        products.add(new ProductListDTO(1L, "팔도)왕뚜껑.jpg", "팔도", "왕뚜껑", "1box",5000,  5000));

        List<CategoryDTO> categories = new ArrayList<>();
        CategoryDTO vegetableFruitCategory = new CategoryDTO(1, "채소 • 과일", new CategoryDTO(2, "test"));

        categories.add(new CategoryDTO(1, "채소", vegetableFruitCategory));
        categories.add(new CategoryDTO(1, "과일", vegetableFruitCategory));
        categories.add(new CategoryDTO(1, "야채", vegetableFruitCategory));
        categories.add(new CategoryDTO(1, "야채", vegetableFruitCategory));

        model.addAttribute("categories", categories);
        model.addAttribute("products", products);

        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "product-category-list");
        return "layout";
    }

    @GetMapping("/productRegistration")
    public String productRegistrationPage(Model model) {
        ProductDetailDTO productDTO = new ProductDetailDTO();

        List<TagDTO> tags = new ArrayList<>();
        tags.add(new TagDTO(1, "태그1"));
        tags.add(new TagDTO(2, "태그2"));
        tags.add(new TagDTO(4, "태그3"));
        tags.add(new TagDTO(5, "태그4"));
        tags.add(new TagDTO(5, "태그5"));

        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(new CategoryDTO(1, "Category1"));
        categories.add(new CategoryDTO(2, "Category2"));
        categories.add(new CategoryDTO(3, "Category4"));
        categories.add(new CategoryDTO(4, "Category6"));

        model.addAttribute("productDTO", productDTO);
        model.addAttribute("productRegistration", new ProductRegistrationDTO(tags, categories));
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "product-management");
        return "layout";
    }

    @GetMapping("/tagManagement")
    public String tagManagementPage(Model model) {

        List<TagDTO> tags = new ArrayList<>();
        tags.add(new TagDTO(1, "태그1"));
        tags.add(new TagDTO(2, "태그2"));
        tags.add(new TagDTO(4, "태그3"));
        tags.add(new TagDTO(5, "태그4"));
        tags.add(new TagDTO(5, "태그5"));

        model.addAttribute("tags", tags);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "tag-management");
        return "layout";
    }

    @GetMapping("/categoryManagement")
    public String categoryManagementPage(Model model) {

        CategoryDTO parentCategory = new CategoryDTO(12, "부모");

        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(new CategoryDTO(1, "Category1", parentCategory));
        categories.add(new CategoryDTO(2, "Category2", parentCategory));
        categories.add(new CategoryDTO(3, "Category4", parentCategory));
        categories.add(new CategoryDTO(4, "Category6", parentCategory));

        model.addAttribute("categories", categories);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "category-management");
        return "layout";
    }

    @GetMapping("/userManagement")
    public String userManagementPage(Model model) {
        List<UserDTO> users = new ArrayList<>();
        users.add(new UserDTO(1, "John Doe", "123-456-7890", "ABC Company", "12345", "123 Main St", "Apt 101",
                "john@example.com", "password123"));
        users.add(new UserDTO(1, "John Doe", "123-456-7890", "ABC Company", "12345", "123 Main St", "Apt 101",
                "john@example.com", "password123"));
        users.add(new UserDTO(1, "John Doe", "123-456-7890", "ABC Company", "12345", "123 Main St", "Apt 101",
                "john@example.com", "password123"));
        users.add(new UserDTO(1, "John Doe", "123-456-7890", "ABC Company", "12345", "123 Main St", "Apt 101",
                "john@example.com", "password123"));
        users.add(new UserDTO(1, "John Doe", "123-456-7890", "ABC Company", "12345", "123 Main St", "Apt 101",
                "john@example.com", "password123"));
        users.add(new UserDTO(1, "John Doe", "123-456-7890", "ABC Company", "12345", "123 Main St", "Apt 101",
                "john@example.com", "password123"));


        model.addAttribute("users", users);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-management");
        return "layout";
    }

    @GetMapping("/user/modify/{id}")
    public String showModifyForm(@PathVariable int id, Model model) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(id);
        userDTO.setName("영암마트");
        userDTO.setPhone("010-1234-5678");
        userDTO.setEmail("hong@example.com");
        userDTO.setCompanyName("ABC 주식회사");
        userDTO.setZipcode("62010");
        userDTO.setAddress("광주광역시 서구 서광주로 28");
        userDTO.setDetailAddress("Y-Mart");

        model.addAttribute("user", userDTO);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-detail-modify");
        return "layout";
    }

    @GetMapping("/productModify/{id}")
    public String productModifyPage(@PathVariable int id, Model model) {
        ProductDetailDTO productDTO = new ProductDetailDTO();
        productDTO.setId(id);
        productDTO.setName("라면 박스");
        productDTO.setImage("/images/noddle");
        productDTO.setOriginalPrice(10000);
        productDTO.setSalePrice(8000);
        productDTO.setBarCodeNumber(999999);
        productDTO.setBrandOrigin("브랜드/원산지");
        productDTO.setWeight("500g");
        productDTO.setPackaging("박스");
        productDTO.setTags(List.of("태그1", "태그2", "태그3"));
        productDTO.setCategory("카테고리 이름");
        productDTO.setQuantity(1);

        model.addAttribute("productDTO", productDTO);

        List<TagDTO> tags = new ArrayList<>();
        tags.add(new TagDTO(1, "태그1"));
        tags.add(new TagDTO(2, "태그2"));
        tags.add(new TagDTO(4, "태그3"));
        tags.add(new TagDTO(5, "태그4"));
        tags.add(new TagDTO(5, "태그4"));

        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(new CategoryDTO(1, "Category1"));
        categories.add(new CategoryDTO(2, "Category2"));
        categories.add(new CategoryDTO(3, "Category4"));
        categories.add(new CategoryDTO(4, "Category6"));

        model.addAttribute("productRegistration", new ProductRegistrationDTO(tags, categories));
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "product-management");
        return "layout";
    }

    @GetMapping("/productDetail/{id}")
    public String detail(@PathVariable int id, Model model) {
        ProductDetailDTO productDTO = new ProductDetailDTO();
        productDTO.setId(id);
        productDTO.setName("라면 박스");
        productDTO.setImage("/images/noddle");
        productDTO.setOriginalPrice(10000);
        productDTO.setSalePrice(8000);
        productDTO.setBrandOrigin("브랜드/원산지");
        productDTO.setWeight("500g");
        productDTO.setPackaging("박스");
        productDTO.setTags(List.of("태그1", "태그2", "태그3"));
        productDTO.setCategory("카테고리 이름");
        productDTO.setQuantity(1);

        model.addAttribute("productDTO", productDTO);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "product-detail");
        model.addAttribute("userId", 1);

        return "layout";
    }

    @GetMapping("/userCart")
    public String cart(Model model) {
        List<CartDto> cartList = new ArrayList<>();
        cartList.add(new CartDto(1L, "상품1", "브랜드", 10000L, 5000L, "noddle.jpg", "1box",1L, 1L));
        cartList.add(new CartDto(1L, "소고기", "국내산", 100000L, 90000L,  "라면박스.jpg","500g", 1L, 1L));

        model.addAttribute("cartList", cartList);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-cart");
        model.addAttribute("userId", 1);

        return "layout";
    }

    @GetMapping("/order-list/order-address")
    public String getOrderPage(Model model) {
        List<ProductDTO> products = new ArrayList<>();
        products.add(new ProductDTO(1L, "삼양", "라면라라면라면라면라면라면라면면라면라면라면라면라면", "1 box", 2L));
        products.add(new ProductDTO(1L, "국내산", "소고기", "500g", 1L));

        List<AddressDTO> addressList = new ArrayList<>();
        addressList.add(new AddressDTO(1L, "서울시 강남구"));
        addressList.add(new AddressDTO(2L, "서울시 종로구"));



        model.addAttribute("products", products);
        model.addAttribute("addressList", addressList);
        model.addAttribute("totalPrice", 9999999);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-order-address");
        return "layout";
    }

    @GetMapping("/discountManagement")
    public String discountPage(Model model) {
        List<DiscountDTO> discountList = new ArrayList<>();
        discountList.add(
                new DiscountDTO(1L, "타임 할인", LocalDateTime.of(2024, 3, 1, 0, 0), LocalDateTime.of(2024, 3, 1, 0, 0)));
        discountList.add(
                new DiscountDTO(2L, "주간 할인", LocalDateTime.of(2024, 3, 1, 0, 0), LocalDateTime.of(2024, 3, 1, 0, 0)));
        discountList.add(
                new DiscountDTO(3L, "카테고리 할인", LocalDateTime.of(2024, 3, 1, 0, 0), LocalDateTime.of(2024, 3, 1, 0, 0)));
        discountList.add(
                new DiscountDTO(4L, "신상 할인", LocalDateTime.of(2024, 3, 1, 0, 0), LocalDateTime.of(2024, 3, 1, 0, 0)));
        model.addAttribute("discounts", discountList);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "discount-management");
        return "layout";
    }

    @GetMapping("/orderList")
    public String getOrderListPage(Model model) {
        List<OrderListDto> orderList = new ArrayList<>();
        orderList.add(new OrderListDto(1L,1L, "승인 완료", 50000, LocalDateTime.of(2024, 3, 1, 0, 0), "마트1"));
        orderList.add(new OrderListDto(1L,1L, "승인 거절", 30000, LocalDateTime.of(2024, 3, 2, 0, 0), "마트2"));
        orderList.add(new OrderListDto(1L,1L, "승인 보류", 80000, LocalDateTime.of(2024, 3, 3, 0, 0), "마트3"));

        model.addAttribute("orderList", orderList);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-order-list");
        return "layout";
    }

    @GetMapping("/orderManagement")
    public String orderListManagementPage(Model model) {
        List<OrderListDto> orderList = new ArrayList<>();

        orderList.add(new OrderListDto(1L,1L, "새 주문", 80000, LocalDateTime.of(2024, 3, 3, 0, 0), "new 마트"));
        orderList.add(new OrderListDto(1L,1L, "승인 완료", 50000, LocalDateTime.of(2024, 3, 1, 0, 0), "마트1"));
        orderList.add(new OrderListDto(1L,1L, "승인 거절", 30000, LocalDateTime.of(2024, 3, 2, 0, 0), "마트2"));
        orderList.add(new OrderListDto(1L,1L, "승인 보류", 80000, LocalDateTime.of(2024, 3, 3, 0, 0), "마트3"));

        model.addAttribute("orders", orderList);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "order-management");
        return "layout";
    }

    @GetMapping("/order-list-detail/1")
    public String getOrderDetailPage(Model model) {
        OrderDetailDto orderDetailDto = new OrderDetailDto();
        orderDetailDto.setOrderListId(1L);
        orderDetailDto.setOrderNumber(12345L);
        orderDetailDto.setOrderApprovalStatus("승인 완료");
        orderDetailDto.setOrderDate(LocalDate.now());
        orderDetailDto.setAddress("서울시 강남구");
        orderDetailDto.setTotalPrice(50000);
        orderDetailDto.setCompanyName("마트1");
        orderDetailDto.setUserName("홍길동");

        List<ProductDTO> products = new ArrayList<>();
        products.add(new ProductDTO(1L, "삼양", "라면aslkjdhflasdkjhfljkashdflkjahsdlfkjhasdlkjhflasjkdh", "1 box", 2L));
        products.add(new ProductDTO(1L, "국내산", "소고기", "500g", 1L));
        orderDetailDto.setProducts(products);

        model.addAttribute("orderDetail", orderDetailDto);
        model.addAttribute("userId", 1);
        model.addAttribute("isUser",false);
        model.addAttribute("isAdmin",false);
        model.addAttribute("loggedIn",false);
        model.addAttribute("content", "user-order-detail");
        return "layout";
    }

    @GetMapping("/loginForm")
    public String login(Model model) {
        model.addAttribute("userId", 1);
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "register";
    }
    @GetMapping("/error")
    public String error(Model model) {
        model.addAttribute("userId", 1);
        return "error";
    }
    @GetMapping("/user/find-password")
    public String findId(Model model) {
        model.addAttribute("userId", 1);
        return "find_password";
    }
    @GetMapping("/find-password/verify")
    public String findPassword(Model model) {
        model.addAttribute("userId", 1);
        return "update_password";
    }
}
