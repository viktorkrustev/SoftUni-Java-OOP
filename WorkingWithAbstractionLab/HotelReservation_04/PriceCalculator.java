package WorkingWithAbstractionLab.HotelReservation_04;

public class PriceCalculator {

    public static double calculateHolidayPrice(double pricePerDay, int days, Season season, DiscountType discountType) {
        double priceAllDays = pricePerDay * days;
        priceAllDays = priceAllDays * season.getMultiplyCoefficient();
        priceAllDays = priceAllDays - priceAllDays * (discountType.getPercent() / 100);

        return priceAllDays;
    }
}
