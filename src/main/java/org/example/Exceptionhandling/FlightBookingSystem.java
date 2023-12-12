package org.example.Exceptionhandling;

public class FlightBookingSystem {
    public static void main(String[] args) {
        try {
            bookFlights("Rohini", "12345678", 5, 100.0);

        } catch (NetworkConnectionException e) {
            System.err.println("Network Connection Exception or unable to connect to flight booking server");
        } catch (InvalidInputException e) {
            System.err.println("Invalid Input Exception please enter valid number of passangers");
        } catch (SeatReservationException e) {
            System.err.println("SeatReservationException you can only book 10 seats per account");
        } catch (InsufficientFundsException e) {
            System.err.println("InsufficientFundsException or amount which you have enterd must be greater than 0");
        }
    }
    public static void bookFlights(String passangername,String creditcardnumber,int noofpassangers,Double amount)
            throws NetworkConnectionException, InvalidInputException, SeatReservationException, InsufficientFundsException {
        if (noofpassangers < 1) {
            throw new InvalidInputException("invalid input");
        }
        if (noofpassangers > 10) {
            throw new SeatReservationException("you can only book 10 seats per account");
        }
        if (amount < 0) {
            throw new InsufficientFundsException("Insufficient Funds or amount must be greater than 0");
        }
    System.out.println("Flight booked for " + passangername);
        }
    }

