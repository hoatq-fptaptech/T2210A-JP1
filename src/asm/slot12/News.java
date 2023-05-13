package asm.slot12;

import java.util.ArrayList;

public class News implements INews{
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    double avgRate;
    ArrayList<Integer> rateList;

    public News(int id, String title, String publishDate, String author, String content, double avgRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.avgRate = avgRate;
        rateList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getAvgRate() {
        return avgRate;
    }

    @Override
    public void display() {
        System.out.println("title:"+title);
        System.out.println("publish date:"+publishDate);
        System.out.println("content:"+content);
        System.out.println("avg rate:"+avgRate);
    }

    public void calculate(){
        double total = 0;
        for(Integer i: rateList){
            total+=i;
        }
        avgRate = total/rateList.size();
    }

    public void inputRate(int star){
        if(star >= 1 && star <=5){
            rateList.add(star);
            calculate();
            return;
        }
    }
}
