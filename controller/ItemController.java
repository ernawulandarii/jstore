package jstore.controller;

    import jstore.DatabaseItem;
    import jstore.Item;
    import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

    @RestController
    public class ItemController {

        @RequestMapping("/items")
        public ArrayList<Item> itemsList(){
            return DatabaseItem.getItemDatabase();
        }
        @RequestMapping("/items/{id_item}")
        public Item getItemFromID(@PathVariable int id_item){
            return DatabaseItem.getItemFromID(id_item);
        }
    }

