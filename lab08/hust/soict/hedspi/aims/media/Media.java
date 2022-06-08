package media;

public abstract class Media implements Comparable<Media> {
    private String title;
    private String category;
    private float cost;
    private int id;

    public Media(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this.getId() == ((Media) o).getId()) {
            return true;
        } else
            return false;
    }

    @Override
    public int compareTo(Media o) {
        // TODO Auto-generated method stub
        if (this.getId() == o.getId()) {
            return 1;
        }
        return 0;
    }

}