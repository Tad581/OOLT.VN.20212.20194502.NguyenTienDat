package media;

public abstract class Media {
    private String title;
    private String category;
    private float cost;

    public Media(String title) {
        this.title = title;
    }

    public Media(String title, String category) {
        this(title);
        this.category = category;
    }

    public Media(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public float getCost() {
        return cost;
    }

    public boolean search(String title) {
        title = title.toLowerCase();
        String[] part = title.split(" ");
        int i;
        String tit = this.getTitle();
        tit = tit.toLowerCase();
        for (i = 0; i < part.length; i++) {
            if (tit.contains(part[i]) == false)
                return false;
        }
        return true;
    }

}