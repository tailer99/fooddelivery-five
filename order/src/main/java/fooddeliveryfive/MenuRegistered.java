package fooddeliveryfive;

public class MenuRegistered extends AbstractEvent {

    private Long id;
    private String menuName;

    public MenuRegistered(){
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
