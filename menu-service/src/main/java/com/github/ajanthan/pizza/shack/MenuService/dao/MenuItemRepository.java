package com.github.ajanthan.pizza.shack.MenuService.dao;

import com.github.ajanthan.pizza.shack.MenuService.model.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItem, Long> {
}
