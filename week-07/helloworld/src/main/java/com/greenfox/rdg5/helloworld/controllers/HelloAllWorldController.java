package com.greenfox.rdg5.helloworld.controllers;

import com.greenfox.rdg5.helloworld.differentLanguages;
import java.util.ArrayList;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloAllWorldController {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};

  @RequestMapping("/web/world")
  public String helloInDifferentLanguages(Model model) {
    ArrayList<differentLanguages> greetings = new ArrayList<>();
    for (String language : hellos) {
      long value = new Random().nextInt(22) + 20;
      differentLanguages renameIt = new differentLanguages(value, getRandomColor(),
          randomFontSize());
      greetings.add(renameIt);
    }
    model.addAttribute("greetings", greetings);
    return "hello";
  }


  public String getRandomColor() {
    Random random = new Random();
    return String
        .format(("#%02x%02x%02x"), random.nextInt(256), random.nextInt(256), random.nextInt(256));
  }

  public long randomFontSize() {
    return 15;
  }
}
