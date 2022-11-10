package services;

import models.*;

public class BookStatistics implements Visitor {
    private int images = 0;
    private int paragraphs = 0;
    private int tables = 0;


    @Override
    public void visitBook(Book b) {

    }

    @Override
    public void visitSection(Section s) {

    }

    @Override
    public void visitTableOfContents(TableOfContents table) {

    }

    @Override
    public void visitParagraph(Paragraph p) {
        paragraphs++;
    }

    @Override
    public void visitImageProxy(ImageProxy image) {
        images++;
    }

    @Override
    public void visitImage(Image img) {
        images++;
    }

    @Override
    public void visitTable(Table tbl) {
        tables++;
    }

    public void printStatistics() {
        System.out.println("visited paragraphs:" + paragraphs);
        System.out.println("visited images:" + images);
        System.out.println("visited tables:" + tables);
    }
}
