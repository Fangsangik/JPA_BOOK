package jpabook.jpashop.domain;

import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

public class Delivery {
    private String city;
    private String street;
    private String zipcode;
    private DelvieryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;
}
