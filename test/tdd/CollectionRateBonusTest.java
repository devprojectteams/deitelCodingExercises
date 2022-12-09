package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionRateBonusTest {
    @Test
    public void whereAmountPerParcelFor50_59PercentIs200(){
        //Given that Bonus Plan exist for successful deliveries
        CollectionRateBonus parcels = new CollectionRateBonus();
        //When we want to give bonuses based on the successful deliveries
        int bonus = parcels.successfulDeliveriesBonusCollection( 59);
        //Check that Bonus for between 50% - 59% CR equals Number successful deliveries of Parcels * 200
        assertEquals(11_800,parcels.successfulDeliveriesBonusCollection(59));
    }



    @Test
    public void whereAmountPerParcelFor60_69PercentIs250(){
        //Given that Bonus Plan exist for successful deliveries
        CollectionRateBonus parcels = new CollectionRateBonus();
        //When we want to give bonuses based on the successful deliveries
        int bonus = parcels.successfulDeliveriesBonusCollection( 69);
        //Check that Bonus for between 60% - 69% CR equals Number successful deliveries of Parcels * 250
        assertEquals(17_250,parcels.successfulDeliveriesBonusCollection(69));
    }



@Test
public void whereAmountPerParcelFor70PercentAndAboveIs500(){
        //Given that Bonus Plan exist for successful deliveries
        CollectionRateBonus parcels = new CollectionRateBonus();
        //When we want to give bonuses based on the successful deliveries
        int bonus = parcels.successfulDeliveriesBonusCollection(100);
        //Check that Bonus for 70% and above CR equals Number successful deliveries of Parcels * 500
        assertEquals(50_000,parcels.successfulDeliveriesBonusCollection(100));
        }


        }