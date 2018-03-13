package com.github.ajanthan.pizza.shack.MenuService.service;

import com.github.ajanthan.pizza.shack.MenuService.dao.MenuItemRepository;
import com.github.ajanthan.pizza.shack.MenuService.model.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuItemService {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @RequestMapping("/menu")
    public Iterable<MenuItem> getMenu() {
        return menuItemRepository.findAll();
    }
}
