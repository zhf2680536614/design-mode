package com.atey.design_mode.di_mi_te;

public class ClientDemo {
    public static void main(String[] args) {
        Fans fans = new Fans("红哥");
        Star star = new Star("峰哥");
        Company company = new Company("ATEY");

        Agent agent = new Agent();
        agent.setCompany(company);
        agent.setFans(fans);
        agent.setStar(star);

        agent.meeting();
        agent.talk();
    }
}
