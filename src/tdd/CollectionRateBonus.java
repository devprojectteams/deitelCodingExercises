package tdd;

public class CollectionRateBonus {

private int bonus = 0;

    public int successfulDeliveriesBonusCollection( int successfullyDeliveredParcel_sCollectionRatePercentage){
        if (successfullyDeliveredParcel_sCollectionRatePercentage >=50 && successfullyDeliveredParcel_sCollectionRatePercentage <=59){

            return bonus = successfullyDeliveredParcel_sCollectionRatePercentage * 200;
        }


        if (successfullyDeliveredParcel_sCollectionRatePercentage >= 60 && successfullyDeliveredParcel_sCollectionRatePercentage <= 69) {

            return bonus = successfullyDeliveredParcel_sCollectionRatePercentage * 250;
        }


             if (successfullyDeliveredParcel_sCollectionRatePercentage >= 70) {

                return bonus = successfullyDeliveredParcel_sCollectionRatePercentage * 500;
            }


        return bonus;
    }
}
