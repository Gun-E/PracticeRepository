package org.example.test.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.example.test.domain.AddressDTO;
import org.example.test.domain.CartDto;
import org.example.test.domain.CategoryDTO;
import org.example.test.domain.MemberDTO;
import org.example.test.domain.NoticeDetailDto;
import org.example.test.domain.NoticeDto;
import org.example.test.domain.OrderDTO;
import org.example.test.domain.OrderDetailDto;
import org.example.test.domain.OrderListDto;
import org.example.test.domain.ProductDTO;
import org.example.test.domain.ProductDetailDTO;
import org.example.test.domain.ProductListDTO;
import org.example.test.domain.ProductRegistrationDTO;
import org.example.test.domain.TagDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String home(Model model){
        List<ProductListDTO> products = new ArrayList<>();

        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/ramen-box", "삼양", "삼양라면 1 박스", 50000));
        products.add(new ProductListDTO(1L, "/images/carrot", "국내산", "당근", 100));
        products.add(new ProductListDTO(1L, "/images/beef", "국내산", "한우 A++", 9999999));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));

        model.addAttribute("products", products);
        model.addAttribute("content", "product-list-starred");
        return "layout";
    }
    @GetMapping("/userDetail")
    public String myPage(Model model) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setName("홍길동");
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong@example.com");
        memberDTO.setCompany("ABC 주식회사");
        memberDTO.setZipcode("62010");
        memberDTO.setAddress("광주광역시 서구 서광주로 28");
        memberDTO.setDetailAddress("Y-Mart");

        model.addAttribute("memberDTO", memberDTO);
        model.addAttribute("content", "user-detail");
        return "layout";
    }
    @GetMapping("/notice")
    public String noticePage(Model model) {
        List<NoticeDto> notices = new ArrayList<>();
        notices.add(new NoticeDto(1,LocalDate.of(2024, 3, 1), "🦾 새로운 기능 추가되었습니다.","관리자1"));
        notices.add(new NoticeDto(1,LocalDate.of(2024, 3, 2), "🖥️ 서버 점검 안내입니다.","관리자2"));
        notices.add(new NoticeDto(1,LocalDate.of(2024, 3, 3), "✏️ 이용약관이 변경되었습니다.","관리자3"));
        notices.add(new NoticeDto(1,LocalDate.of(2024, 3, 4), "😘 회원가입 이벤트가 진행 중입니다.","관리자4"));
        notices.add(new NoticeDto(1,LocalDate.of(2024, 3, 4), "😘 회원가입 이벤트가 진행 중입니다.","관리자4"));

        model.addAttribute("notices", notices);
        model.addAttribute("content", "notice");

        return "layout";
    }
    @GetMapping("/notice_detail/{id}")
    public String showNoticeDetail(@PathVariable int id, Model model) {

        NoticeDetailDto noticeDetailDto = new NoticeDetailDto(
                id,
                "새로운 기능 추가 안내",
                "저희 서비스에 새로운 기능이 추가되었습니다. 이제 더 많은 기능을 이용하실 수 있습니다.",
                "관리자",
                LocalDate.of(2024, 2, 17)
        );

        model.addAttribute("notice_detail", noticeDetailDto);
        model.addAttribute("content", "notice_detail");

        return "layout";
    }
    @GetMapping("/noticeRegistration")
    public String showNoticeRegistration(Model model) {
        NoticeDetailDto noticeDTO = new NoticeDetailDto();
        model.addAttribute("noticeDTO", noticeDTO);
        model.addAttribute("content", "notice_management");
        return "layout";
    }
    @GetMapping("/noticeModify/{id}")
    public String showNoticeModify(@PathVariable int id, Model model) {
        NoticeDetailDto noticeDTO = new NoticeDetailDto(
                id,
                "새로운 기능 추가 안내",
                "저희 서비스에 새로운 기능이 추가되었습니다. 이제 더 많은 기능을 이용하실 수 있습니다.",
                "관리자",
                LocalDate.of(2024, 2, 17)
        );
        model.addAttribute("noticeDTO", noticeDTO);
        model.addAttribute("content", "notice_management");
        return "layout";
    }

    @GetMapping("/productList")
    public String allPage(Model model) {
        List<ProductListDTO> products = new ArrayList<>();

        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(2L, "/images/ramen-box", "삼양", "삼양라면 1 박스", 50000));
        products.add(new ProductListDTO(1L, "/images/carrot", "국내산", "당근", 100));
        products.add(new ProductListDTO(1L, "/images/beef", "국내산", "한우 A++", 9999999));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));

        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(new CategoryDTO(1, "채소 • 과일", "bi bi-egg"));
        categories.add(new CategoryDTO(2, "쌀 • 잡곡 • 견과", "bi bi-basket2"));
        categories.add(new CategoryDTO(3, "축산 • 계란류", "bi bi-egg-fried"));
        categories.add(new CategoryDTO(4, "생선 • 해산물", "bi bi-tencent-qq"));
        categories.add(new CategoryDTO(5, "냉장 • 냉동 간편식", "bi bi-snow3"));
        categories.add(new CategoryDTO(6, "반찬류", "bi bi-box"));
        categories.add(new CategoryDTO(7, "소스 • 양념", "bi bi-paint-bucket"));
        categories.add(new CategoryDTO(8, "장류 • 조미료", "bi bi-sun"));
        categories.add(new CategoryDTO(9, "캔 • 통조림", "bi bi-magnet"));
        categories.add(new CategoryDTO(10, "면류 • 가공식품", "bi bi-egg-fried"));
        categories.add(new CategoryDTO(11, "스낵 • 안주류", "bi bi-cookie"));
        categories.add(new CategoryDTO(12, "액체류", "bi bi-cup-straw"));
        categories.add(new CategoryDTO(13, "일반용품", "bi bi-cup-straw"));
        categories.add(new CategoryDTO(14, "주방용품", "bi bi-cup-straw"));
        categories.add(new CategoryDTO(15, "포장용기 • 일회용품", "bi bi-trash"));


        // 모델에 카테고리 목록 추가
        model.addAttribute("categories", categories);

        model.addAttribute("products", products);
        model.addAttribute("content", "product-list");
        return "layout";
    }
    @GetMapping("/category/{id}")
    public String categoryPage(@PathVariable int id, Model model) {
        List<ProductListDTO> products = new ArrayList<>();

        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));
        products.add(new ProductListDTO(2L, "/images/ramen-box", "삼양", "삼양라면 1 박스", 50000));
        products.add(new ProductListDTO(1L, "/images/carrot", "국내산", "당근", 100));
        products.add(new ProductListDTO(1L, "/images/beef", "국내산", "한우 A++", 9999999));
        products.add(new ProductListDTO(1L, "/images/noddle", "삼양", "삼양라면 5 + 1개입", 5000));

        List<CategoryDTO> categories = new ArrayList<>();
        CategoryDTO vegetableFruitCategory = new CategoryDTO(1, "채소 • 과일", "bi bi-egg");

        categories.add(new CategoryDTO(1, "채소", "bi bi-egg-fill",vegetableFruitCategory));
        categories.add(new CategoryDTO(1, "과일", "bi bi-apple",vegetableFruitCategory));
        categories.add(new CategoryDTO(1, "야채", "bi bi-pin-map-fill",vegetableFruitCategory));
        categories.add(new CategoryDTO(1, "야채", "bi bi-pin-map-fill",vegetableFruitCategory));

        model.addAttribute("categories", categories);

        model.addAttribute("products", products);
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
        tags.add(new TagDTO(5, "태그4"));

        List<CategoryDTO> categories = new ArrayList<>();
        categories.add(new CategoryDTO(1, "Category1",""));
        categories.add(new CategoryDTO(2, "Category2",""));
        categories.add(new CategoryDTO(3, "Category4",""));
        categories.add(new CategoryDTO(4, "Category6",""));

        model.addAttribute("productDTO", productDTO);
        model.addAttribute("productRegistration", new ProductRegistrationDTO(tags, categories));
        model.addAttribute("content", "product-management");
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
        productDTO.setTags(List.of("태그1","태그2","태그3"));
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
        categories.add(new CategoryDTO(1, "Category1",""));
        categories.add(new CategoryDTO(2, "Category2",""));
        categories.add(new CategoryDTO(3, "Category4",""));
        categories.add(new CategoryDTO(4, "Category6",""));

        model.addAttribute("productRegistration", new ProductRegistrationDTO(tags, categories));
        model.addAttribute("content", "product-management");
        return "layout";
    }

    @GetMapping("/productDetail/{id}")
    public String detail(@PathVariable int id, Model model){
        ProductDetailDTO productDTO = new ProductDetailDTO();
        productDTO.setId(id);
        productDTO.setName("라면 박스");
        productDTO.setImage("/images/noddle");
        productDTO.setOriginalPrice(10000);
        productDTO.setSalePrice(8000);
        productDTO.setBrandOrigin("브랜드/원산지");
        productDTO.setWeight("500g");
        productDTO.setPackaging("박스");
        productDTO.setTags(List.of("태그1","태그2","태그3"));
        productDTO.setCategory("카테고리 이름");
        productDTO.setQuantity(1);

        model.addAttribute("productDTO", productDTO);
        model.addAttribute("content", "product-detail");

        return "layout";
    }

    @GetMapping("/userDetailModify")
    public String modify(Model model) {
        MemberDTO memberDTO = new MemberDTO();

        memberDTO.setName("홍길동");
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong@example.com");
        memberDTO.setCompany("ABC 주식회사");
        memberDTO.setZipcode("62010");
        memberDTO.setAddress("광주광역시 서구 서광주로 28");
        memberDTO.setDetailAddress("Y-Mart");

        model.addAttribute("memberDTO", memberDTO);
        model.addAttribute("content", "user-detail-modify");
        return "layout";
    }

    @GetMapping("/userCart")
    public String cart(Model model){
        List<CartDto> cartList = new ArrayList<>();
        cartList.add(new CartDto("상품1","브랜드", 10000, 5000, List.of("태그1", "태그2"), "/images/noddle", "1box",1));
        cartList.add(new CartDto("소고기","국내산", 100000, 90000, List.of("태그3", "태그2"), "/images/beef", "500g",1));

        model.addAttribute("cartList", cartList);
        model.addAttribute("content", "user-cart");

        return "layout";
    }
    @GetMapping("/order")
    public String getOrderPage(Model model) {
        List<ProductDTO> products = new ArrayList<>();
        products.add(new ProductDTO(1,"삼양", "라면", "1 box", 2));
        products.add(new ProductDTO(1,"국내산", "소고기", "500g", 1));

        List<AddressDTO> addressList = new ArrayList<>();
        addressList.add(new AddressDTO(1, "서울시 강남구"));
        addressList.add(new AddressDTO(2, "서울시 종로구"));

        OrderDTO order = new OrderDTO();
        order.setProducts(products);
        order.setAddressList(addressList);
        order.setTotalPrice(50000.0);

        model.addAttribute("order", order);
        model.addAttribute("content", "user-order-address");
        return "layout";
    }
    @GetMapping("/orderList")
    public String getOrderListPage(Model model) {
        List<OrderListDto> orderList = new ArrayList<>();
        orderList.add(new OrderListDto(1, "승인 완료", 50000, LocalDate.of(2024, 3, 1)));
        orderList.add(new OrderListDto(1, "승인 거절", 30000, LocalDate.of(2024, 3, 2)));
        orderList.add(new OrderListDto(1, "승인 보류", 80000, LocalDate.of(2024, 3, 3)));

        model.addAttribute("orderList", orderList);
        model.addAttribute("content", "user-order-list");

        return "layout";
    }
    @GetMapping("/orderDetail/1")
    public String getOrderDetailPage(Model model) {
        OrderDetailDto orderDetailDto = new OrderDetailDto();
        orderDetailDto.setOrderNumber(12345);
        orderDetailDto.setStatus("승인 완료");
        orderDetailDto.setDay(LocalDate.now());
        orderDetailDto.setAddress("서울시 강남구");
        //orderDetailDto.setComment("특이 사항 없음");
        orderDetailDto.setTotalPrice(50000);

        List<ProductDTO> products = new ArrayList<>();
        products.add(new ProductDTO(1,"삼양", "라면", "1 box", 2));
        products.add(new ProductDTO(1,"국내산", "소고기", "500g", 1));
        orderDetailDto.setProducts(products);

        model.addAttribute("orderDetail", orderDetailDto);
        model.addAttribute("content", "user-order-detail");
        return "layout";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
