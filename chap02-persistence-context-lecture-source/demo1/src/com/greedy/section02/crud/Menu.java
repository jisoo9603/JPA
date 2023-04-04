package src.com.greedy.section02.crud;

import javax.persistence.Entity;

@Entity(name = "Section02Menu")
@Table(name="TBL_MENU")
public class Menu{

    @Id
    @Column(name="MENU_CODE")
    private int menuCode;

    @Column(name = "MENU_NAME")
    private String menuName;

    @Column(name = "MENU_PRICE")
    private int menuPrice;

    @Column(name = "CATEGORY_CODE")
    private int categoryCode;

    @Column(name = "ORDERABLE_STATUS")
    private String orderableStatus;
}