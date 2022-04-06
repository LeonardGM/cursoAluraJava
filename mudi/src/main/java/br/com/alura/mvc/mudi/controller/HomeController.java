package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	

	@GetMapping("/home")
	public String home(Model model){
		
		Pedido pedido = new Pedido();
			pedido.setNomeProduto("2020 / 2021 Camisa De Futebol Roma II");
			pedido.setUrlImagem("https://shopee.com.br/2020-2021-Camisa-De-Futebol-Roma-II-i.343499006.4870551731");
			pedido.setUrlProduto("https://shopee.com.br/2020-2021-Camisa-De-Futebol-Roma-II-i.343499006.4870551731");
			pedido.setDescricao("Camisa Roma Torcedor 2020/2021");
			
			List<Pedido> pedidos = Arrays.asList(pedido);
			model.addAttribute("pedidos", pedidos);
			
		return "home";
	}
	
	
}
