package fooddeliveryfive;

public class MenuDeleted extends AbstractEvent {

    private Long id;
    private String menuName;

    public MenuDeleted(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
