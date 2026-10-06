public class TextLabel implements Drawable{
    private String textT;
    public TextLabel(String textT)
    {
        this.textT = textT;
    }
    @Override
    public void draw() {
        System.out.println("Text "+textT);
    }
}
