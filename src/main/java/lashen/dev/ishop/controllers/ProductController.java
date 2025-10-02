package lashen.dev.ishop.controllers;

import lashen.dev.ishop.models.Product;
import lashen.dev.ishop.services.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping({"", "/"})
    public String showProductsList(Model model) {
        List<Product> products = productsRepository.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }
}
