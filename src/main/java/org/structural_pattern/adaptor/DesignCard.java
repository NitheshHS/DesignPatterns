package org.structural_pattern.adaptor;

public class DesignCard {

    String buildCard(Customer customer){
        String card = customer.firstName();
        card+= "\n"+customer.currentLocation();
        card+="\n"+customer.occupation();
        return card;
    }
}
