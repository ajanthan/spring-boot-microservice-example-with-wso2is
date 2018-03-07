package com.github.ajanthan.pizza.shack.MenuService;

import com.github.ajanthan.pizza.shack.MenuService.dao.MenuItemRepository;
import com.github.ajanthan.pizza.shack.MenuService.model.MenuItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableOAuth2Sso
public class MenuServiceApplication {
    private static final Logger log = LoggerFactory.getLogger(MenuServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MenuServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(MenuItemRepository menuItemRepository) {
        return args -> {
            //save couple of menu items
            MenuItem item1 = new MenuItem();
            item1.setName("Chicken Parmesan");
            item1.setDescription("Grilled chicken, fresh tomatoes, feta and mozzarella cheese");
            item1.setPrice(12.09);
            item1.setImage("000001");
            menuItemRepository.save(item1);

            MenuItem item2 = new MenuItem();
            item2.setName("Spicy Italian");
            item2.setDescription("Pepperoni and a double portion of spicy Italian sausage");
            item2.setPrice(11.23);
            item2.setImage("000002");
            menuItemRepository.save(item2);

            MenuItem item3 = new MenuItem();
            item3.setName("Garden Fresh");
            item3.setDescription("Slices onions and green peppers, gourmet " +
                    "mushrooms, black olives and ripe Roma tomatoes");
            item3.setPrice(13.00);
            item3.setImage("000003");
            menuItemRepository.save(item3);

            MenuItem item4 = new MenuItem();
            item4.setName("Tuscan Six Cheese");
            item4.setDescription("Six cheese blend of mozzarella, Parmesan, Romano, Asiago and Fontina");
            item4.setPrice(10.22);
            item4.setImage("000004");
            menuItemRepository.save(item4);

            MenuItem item5 = new MenuItem();
            item5.setName("Spinach Alfredo");
            item5.setDescription("Rich and creamy blend of spinach and garlic Parmesan with Alfredo sauce");
            item5.setPrice(9.98);
            item5.setImage("000005");
            menuItemRepository.save(item5);

			/*MenuItem item6 = new MenuItem();
			item6.setName("BBQ Chicken Bacon");
			item6.setDescription("Grilled white chicken, hickory-smoked bacon and fresh sliced onions in barbeque sauce");
			item6.setPrice(format.format(rand.nextInt(20) + 10 - 0.01));
			item6.setIcon("/images/6.png");
			items.add(item6);

			MenuItem item7 = new MenuItem();
			item7.setName("Hawaiian BBQ Chicken");
			item7.setDescription("Grilled white chicken, hickory-smoked bacon, barbeque sauce topped with sweet pine-apple");
			item7.setPrice(format.format(rand.nextInt(20) + 10 - 0.01));
			item7.setIcon("/images/7.png");
			items.add(item7);

			MenuItem item8 = new MenuItem();
			item8.setName("Grilled Chicken Club");
			item8.setDescription("Grilled white chicken, hickory-smoked bacon and fresh sliced onions topped with Roma tomatoes");
			item8.setPrice(format.format(rand.nextInt(20) + 10 - 0.01));
			item8.setIcon("/images/8.png");
			items.add(item8);

			MenuItem item9 = new MenuItem();
			item9.setName("Double Bacon 6Cheese");
			item9.setDescription("Hickory-smoked bacon, Julienne cut Canadian bacon, Parmesan, " +
					"mozzarella, Romano, Asiago and and Fontina cheese");
			item9.setPrice(format.format(rand.nextInt(20) + 10 - 0.01));
			item9.setIcon("/images/9.png");
			items.add(item9);

			MenuItem item10 = new MenuItem();
			item10.setName("Chilly Chicken Cordon Bleu");
			item10.setDescription("Spinash Alfredo sauce topped with grilled chicken, ham, onions and " +
					"mozzarella");
			item10.setPrice(format.format(rand.nextInt(20) + 10 - 0.01));
			item10.setIcon("/images/10.png");
			items.add(item10);*/

            log.info("Getting all menu");

            for (MenuItem menuItem : menuItemRepository.findAll()) {
                log.info("Menu item :" + menuItem.toString());
            }

        };
    }
}
