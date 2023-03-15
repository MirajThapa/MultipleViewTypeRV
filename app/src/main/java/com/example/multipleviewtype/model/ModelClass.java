package com.example.multipleviewtype.model;

public class ModelClass {
    public static final int LAYOUT_ONE = 1;// receiver message
    public static final int LAYOUT_TWO = 2;// sender message
    public static final int LAYOUT_THREE =3;// receiver image
    public static final int LAYOUT_FOUR = 4;// sender image

    private final int viewType;
    private String message;
    private int image;


    public ModelClass(int viewType, String message) {
        this.viewType = viewType;
        this.message = message;
    }

    public ModelClass(int viewType, int image) {
        this.viewType = viewType;
        this.image = image;
    }

    public int getViewType() {
        return viewType;
    }

    public String getMessage() {
        return message;
    }

    public int getImage() {
        return image;
    }
}
