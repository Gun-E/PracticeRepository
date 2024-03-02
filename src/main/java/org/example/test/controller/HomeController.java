package org.example.test.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.example.test.domain.AddressDTO;
import org.example.test.domain.CartDto;
import org.example.test.domain.MemberDTO;
import org.example.test.domain.NoticeDetailDto;
import org.example.test.domain.NoticeDto;
import org.example.test.domain.OrderDTO;
import org.example.test.domain.ProductDTO;
import org.example.test.domain.ProductDetailDTO;
import org.example.test.domain.ProductListDTO;
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
    @GetMapping("/myPage")
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
        notices.add(new NoticeDto(1, "2024년 2월 17일: 새로운 기능 추가되었습니다."));
        notices.add(new NoticeDto(1, "2024년 2월 15일: 서버 점검 안내입니다."));
        notices.add(new NoticeDto(1, "2024년 2월 10일: 이용약관이 변경되었습니다."));
        notices.add(new NoticeDto(1, "2024년 2월 5일: 회원가입 이벤트가 진행 중입니다."));

        model.addAttribute("notices", notices);
        model.addAttribute("content", "notice");

        return "layout";
    }
    @GetMapping("/notice_detail/{id}")
    public String showNoticeDetail(@PathVariable int id, Model model) {

        NoticeDetailDto noticeDetailDto = new NoticeDetailDto(
                "새로운 기능 추가 안내",
                "저희 서비스에 새로운 기능이 추가되었습니다. 이제 더 많은 기능을 이용하실 수 있습니다.",
                "관리자",
                LocalDate.of(2024, 2, 17)
        );

        model.addAttribute("notice_detail", noticeDetailDto);
        model.addAttribute("content", "notice_detail");

        return "layout";
    }
    @GetMapping("/allPage")
    public String allPage(Model model) {
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
        model.addAttribute("content", "product-list");
        return "layout";
    }
    @GetMapping("/modify")
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
    @GetMapping("/detail/1")
    public String detail(Model model){
        ProductDetailDTO productDTO = new ProductDetailDTO();
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
    @GetMapping("/cart")
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
        products.add(new ProductDTO("삼양", "라면", "1 box", 2));
        products.add(new ProductDTO("국내산", "소고기", "500g", 1));

        List<AddressDTO> addressList = new ArrayList<>();
        addressList.add(new AddressDTO(1, "서울시 강남구"));
        addressList.add(new AddressDTO(2, "서울시 종로구"));

        OrderDTO order = new OrderDTO();
        order.setProducts(products);
        order.setAddressList(addressList);
        order.setTotalPrice(50000.0);

        model.addAttribute("order", order);
        model.addAttribute("content", "user-order");
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
