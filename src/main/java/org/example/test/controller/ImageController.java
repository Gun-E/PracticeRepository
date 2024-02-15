package org.example.test.controller;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

@RestController
public class ImageController {

    private final ResourceLoader resourceLoader;

    public ImageController(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    @GetMapping("/images/logo")
    public ResponseEntity<byte[]> getLogoImage() throws IOException {
        return getImage("logo.gif");
    }
    @GetMapping("/images/copy_logo")
    public ResponseEntity<byte[]> getCopyLogoImage() throws IOException {
        return getImage("copy_logo.png");
    }

    @GetMapping("/images/noddle")
    public ResponseEntity<byte[]> getNoddleImage() throws IOException {
        return getImage("noddle.jpg");
    }

    @GetMapping("/images/ramen-box")
    public ResponseEntity<byte[]> getRamenBoxImage() throws IOException {
        return getImage("라면박스.jpg");
    }

    @GetMapping("/images/carrot")
    public ResponseEntity<byte[]> getCarrotImage() throws IOException {
        return getImage("당근.jpg");
    }

    @GetMapping("/images/omok-eye")
    public ResponseEntity<byte[]> getOmokEyeImage() throws IOException {
        return getImage("오목눈이.jpg");
    }

    @GetMapping("/images/beef")
    public ResponseEntity<byte[]> getBeefImage() throws IOException {
        return getImage("소고기.jpg");
    }
    @GetMapping("/images/thumbnail")
    public ResponseEntity<byte[]> getThumbnail() throws IOException {
        return getImage("파비콘.png");
    }
    @GetMapping("/images/hide_password")
    public ResponseEntity<byte[]> gethide_password() throws IOException {
        return getImage("hide_password.png");
    }
    @GetMapping("/images/show_password")
    public ResponseEntity<byte[]> getshow_passwordl() throws IOException {
        return getImage("show_password.png");
    }
    @GetMapping("/images/kakao_login")
    public ResponseEntity<byte[]> getkakao_login() throws IOException {
        return getImage("kakao_login.png");
    }


    private ResponseEntity<byte[]> getImage(String imageName) throws IOException {
        Resource resource = resourceLoader.getResource("classpath:images/" + imageName);
        InputStream inputStream = resource.getInputStream();
        byte[] bytes = inputStream.readAllBytes();
        String base64 = Base64.getEncoder().encodeToString(bytes);
        return ResponseEntity.ok().body(Base64.getDecoder().decode(base64));
    }
}
