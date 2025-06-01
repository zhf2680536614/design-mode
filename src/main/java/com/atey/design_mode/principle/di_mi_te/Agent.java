package com.atey.design_mode.principle.di_mi_te;

public class Agent {

    private Star star;
    private Fans fans;
    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fans getFans() {
        return fans;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting() {
        System.out.println(star.getName() + "明星和粉丝" + fans.getName() + "见面");
    }

    public void talk() {
        System.out.println(star.getName() + "明星和公司" + fans.getName() + "洽谈");
    }
}
