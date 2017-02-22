package com.vaadin;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChartsData {
    public static class WeatherInfo {
        private Instant instant;
        private int maxTemp;
        private int meanTemp;
        private int minTemp;
        private int dewPoint;
        private int meanDewPoint;
        private int minDewPoint;
        private int maxHumidity;
        private int meanHumidity;
        private int minHumidity;
        private int maxSeaLevelPressure; // Pa
        private int meanSeaLevelPressure; // Pa
        private int minSeaLevelPressure; // Pa
        private int maxVisibility; // km
        private int meanVisibility; // km
        private int minVisibility; // km
        private int maxWindSpeed; // km/h
        private int meanWindSpeed; // km/h
        private int maxGustSpeed; // km/h
        private float precipitation; // mm
        private int cloudCover;
        private String events;
        private int windDirection; // degrees

        private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        public WeatherInfo(String dateStr, int maxTemp, int meanTemp, int minTemp, int dewPoint, int meanDewPoint, int minDewPoint, int maxHumidity, int meanHumidity, int minHumidity, int maxSeaLevelPressure, int meanSeaLevelPressure, int minSeaLevelPressure, int maxVisibility, int meanVisibility, int minVisibility, int maxWindSpeed, int meanWindSpeed, int maxGustSpeed, float precipitation, int cloudCover, String events, int windDirection) throws ParseException {
            instant = LocalDate.parse(dateStr, dtf).atStartOfDay().toInstant(ZoneOffset.UTC);
            this.maxTemp = maxTemp;
            this.meanTemp = meanTemp;
            this.minTemp = minTemp;
            this.dewPoint = dewPoint;
            this.meanDewPoint = meanDewPoint;
            this.minDewPoint = minDewPoint;
            this.maxHumidity = maxHumidity;
            this.meanHumidity = meanHumidity;
            this.minHumidity = minHumidity;
            this.maxSeaLevelPressure = maxSeaLevelPressure;
            this.meanSeaLevelPressure = meanSeaLevelPressure;
            this.minSeaLevelPressure = minSeaLevelPressure;
            this.maxVisibility = maxVisibility;
            this.meanVisibility = meanVisibility;
            this.minVisibility = minVisibility;
            this.maxWindSpeed = maxWindSpeed;
            this.meanWindSpeed = meanWindSpeed;
            this.maxGustSpeed = maxGustSpeed;
            this.precipitation = precipitation;
            this.cloudCover = cloudCover;
            this.events = events;
            this.windDirection = windDirection;
        }

        public Instant getInstant() {
            return instant;
        }

        public int getMaxTemp() {
            return maxTemp;
        }

        public int getMeanTemp() {
            return meanTemp;
        }

        public int getMinTemp() {
            return minTemp;
        }

        public int getDewPoint() {
            return dewPoint;
        }

        public int getMeanDewPoint() {
            return meanDewPoint;
        }

        public int getMinDewPoint() {
            return minDewPoint;
        }

        public int getMaxHumidity() {
            return maxHumidity;
        }

        public int getMeanHumidity() {
            return meanHumidity;
        }

        public int getMinHumidity() {
            return minHumidity;
        }

        /**
         * @return maximum sea level pressure in Pa
         */
        public int getMaxSeaLevelPressure() {
            return maxSeaLevelPressure;
        }

        /**
         * @return mean sea level pressure in Pa
         */
        public int getMeanSeaLevelPressure() {
            return meanSeaLevelPressure;
        }

        /**
         * @return minimum sea level pressure in Pa
         */
        public int getMinSeaLevelPressure() {
            return minSeaLevelPressure;
        }

        /**
         * @return maximum visibility in km
         */
        public int getMaxVisibility() {
            return maxVisibility;
        }

        /**
         * @return mean visibility in km
         */
        public int getMeanVisibility() {
            return meanVisibility;
        }

        /**
         * @return minimum visibility in km
         */
        public int getMinVisibility() {
            return minVisibility;
        }

        /**
         * @return maximum wind speed in km/h
         */
        public int getMaxWindSpeed() {
            return maxWindSpeed;
        }

        /**
         * @return mean wind speed in km/h
         */
        public int getMeanWindSpeed() {
            return meanWindSpeed;
        }

        /**
         * @return maximum gust speed in km/h
         */
        public int getMaxGustSpeed() {
            return maxGustSpeed;
        }

        /**
         * @return precipitation in mm
         */
        public float getPrecipitation() {
            return precipitation;
        }

        public int getCloudCover() {
            return cloudCover;
        }

        public String getEvents() {
            return events;
        }

        public int getWindDirection() {
            return windDirection;
        }
    }

    public static enum Gender {
        BOY, GIRL
    }
    public static class ShoeSizeInfo {
        private Gender gender;
        private int size;
        private int ageMonths;
        private float footLength;

        ShoeSizeInfo(Gender gender, int size, int ageMonths, float footLength) {
            this.gender = gender;
            this.size = size;
            this.ageMonths = ageMonths;
            this.footLength = footLength;
        }

        public Gender getGender() {
            return gender;
        }

        public int getSize() {
            return size;
        }

        public int getAgeMonths() {
            return ageMonths;
        }

        public float getFootLength() {
            return footLength;
        }
    }

    private List<ShoeSizeInfo> boysData;
    private List<ShoeSizeInfo> girlsData;
    private List<WeatherInfo> weatherData;

    public ChartsData() {
        boysData = Arrays.asList(
                new ShoeSizeInfo(Gender.BOY, 17, 3, 9.5f),
                new ShoeSizeInfo(Gender.BOY, 18, 7, 10.1f),
                new ShoeSizeInfo(Gender.BOY, 19, 9, 11.4f),
                new ShoeSizeInfo(Gender.BOY, 20, 11, 12.0f),
                new ShoeSizeInfo(Gender.BOY, 21, 13, 12.5f),
                new ShoeSizeInfo(Gender.BOY, 22, 15, 13.5f),
                new ShoeSizeInfo(Gender.BOY, 23, 20, 14.0f),
                new ShoeSizeInfo(Gender.BOY, 24, 24, 14.5f),
                new ShoeSizeInfo(Gender.BOY, 25, 30, 15.0f),
                new ShoeSizeInfo(Gender.BOY, 26, 36, 16.0f),
                new ShoeSizeInfo(Gender.BOY, 27, 42, 16.5f),
                new ShoeSizeInfo(Gender.BOY, 28, 48, 17.0f),
                new ShoeSizeInfo(Gender.BOY, 29, 54, 17.7f),
                new ShoeSizeInfo(Gender.BOY, 30, 60, 18.3f),
                new ShoeSizeInfo(Gender.BOY, 31, 66, 19.0f),
                new ShoeSizeInfo(Gender.BOY, 32, 78, 19.7f),
                new ShoeSizeInfo(Gender.BOY, 33, 90, 20.3f),
                new ShoeSizeInfo(Gender.BOY, 34, 96, 21.0f),
                new ShoeSizeInfo(Gender.BOY, 35, 108, 21.7f),
                new ShoeSizeInfo(Gender.BOY, 36, 120, 0f),
                new ShoeSizeInfo(Gender.BOY, 37, 132, 0f)
        );
        girlsData = Arrays.asList(
                new ShoeSizeInfo(Gender.GIRL, 17, 4, 9.5f),
                new ShoeSizeInfo(Gender.GIRL, 18, 8, 10.1f),
                new ShoeSizeInfo(Gender.GIRL, 19, 10, 11.4f),
                new ShoeSizeInfo(Gender.GIRL, 20, 12, 12.0f),
                new ShoeSizeInfo(Gender.GIRL, 21, 15, 12.5f),
                new ShoeSizeInfo(Gender.GIRL, 22, 18, 13.5f),
                new ShoeSizeInfo(Gender.GIRL, 23, 24, 14.0f),
                new ShoeSizeInfo(Gender.GIRL, 24, 30, 14.5f),
                new ShoeSizeInfo(Gender.GIRL, 25, 36, 15.0f),
                new ShoeSizeInfo(Gender.GIRL, 26, 42, 16.0f),
                new ShoeSizeInfo(Gender.GIRL, 27, 48, 16.5f),
                new ShoeSizeInfo(Gender.GIRL, 28, 54, 17.0f),
                new ShoeSizeInfo(Gender.GIRL, 29, 60, 17.7f),
                new ShoeSizeInfo(Gender.GIRL, 30, 66, 18.3f),
                new ShoeSizeInfo(Gender.GIRL, 31, 78, 19.0f),
                new ShoeSizeInfo(Gender.GIRL, 32, 84, 19.7f),
                new ShoeSizeInfo(Gender.GIRL, 33, 96, 20.3f),
                new ShoeSizeInfo(Gender.GIRL, 34, 108, 21.0f),
                new ShoeSizeInfo(Gender.GIRL, 35, 120, 21.7f),
                new ShoeSizeInfo(Gender.GIRL, 36, 132, 0f)
        );

        try {
            weatherData = Arrays.asList(
                    new WeatherInfo("2013-01-06", -4, -7, -9, -4, -8, -10, 100, 97, 93, 1027, 1023, 1021, 10, 9, 2, 16, 8, 29, 0.00f, 7, "Fog-Snow", 74),
                    new WeatherInfo("2013-01-07", 0, -4, -9, 0, -4, -9, 100, 97, 93, 1027, 1025, 1021, 10, 9, 5, 10, 5, 0, 0.00f, 7, "Snow", 179),
                    new WeatherInfo("2013-01-08", 1, 0, 0, 1, 0, 0, 100, 98, 93, 1021, 1015, 1013, 10, 7, 1, 13, 10, 27, 0.00f, 8, "Rain-Snow", 230),
                    new WeatherInfo("2013-01-09", 0, -2, -3, 0, -1, -4, 100, 98, 86, 1014, 1009, 1005, 10, 8, 1, 14, 11, 0, 0.00f, 8, "Fog-Rain-Snow", 303),
                    new WeatherInfo("2013-01-10", -3, -6, -8, -4, -6, -8, 100, 92, 80, 1010, 1006, 1004, 10, 10, 10, 27, 14, 47, 0.00f, 8, "Snow", 57),
                    new WeatherInfo("2013-01-11", -5, -7, -8, -7, -8, -10, 93, 86, 80, 1021, 1015, 1010, 10, 10, 9, 35, 24, 42, 0.00f, 8, "Snow", 80),
                    new WeatherInfo("2013-01-12", -8, -13, -18, -10, -13, -20, 100, 91, 85, 1025, 1023, 1021, 10, 9, 5, 19, 11, 0, 0.00f, 7, "Snow", 82),
                    new WeatherInfo("2013-01-13", -4, -11, -18, -5, -9, -20, 100, 94, 85, 1025, 1024, 1022, 10, 9, 1, 16, 5, 0, 0.00f, 8, "Snow", 284),
                    new WeatherInfo("2013-01-14", -4, -6, -7, -6, -7, -8, 100, 88, 80, 1022, 1021, 1020, 10, 10, 10, 21, 13, 0, 0.00f, 7, "", 275),
                    new WeatherInfo("2013-01-15", -6, -9, -12, -7, -9, -13, 100, 93, 86, 1020, 1016, 1014, 10, 9, 5, 19, 8, 0, 0.00f, 6, "Snow", 101),
                    new WeatherInfo("2013-01-16", -6, -7, -7, -7, -7, -8, 100, 93, 86, 1020, 1016, 1013, 10, 7, 2, 21, 16, 0, 0.00f, 8, "Snow", 97),
                    new WeatherInfo("2013-01-17", -7, -13, -19, -8, -13, -20, 93, 91, 85, 1026, 1024, 1021, 10, 10, 10, 19, 13, 0, 0.00f, 6, "Snow", 82),
                    new WeatherInfo("2013-01-18", -17, -21, -26, -18, -23, -28, 92, 85, 77, 1026, 1022, 1018, 10, 10, 10, 10, 6, 0, 0.00f, 0, "Snow", 85),
                    new WeatherInfo("2013-01-19", -7, -18, -29, -7, -19, -31, 100, 87, 76, 1018, 1011, 1005, 10, 6, 2, 11, 5, 0, 0.00f, 7, "Snow", 232),
                    new WeatherInfo("2013-01-20", -6, -10, -13, -7, -9, -14, 100, 93, 86, 1012, 1008, 1004, 10, 9, 1, 21, 10, 0, 0.00f, 7, "Snow", 41),
                    new WeatherInfo("2013-01-21", -8, -12, -16, -9, -12, -17, 93, 90, 85, 1017, 1016, 1012, 10, 9, 2, 19, 10, 0, 0.00f, 7, "Fog-Snow", 31),
                    new WeatherInfo("2013-01-22", -3, -7, -11, -4, -8, -11, 100, 94, 86, 1016, 1012, 1010, 10, 9, 1, 13, 10, 0, 0.00f, 6, "Fog-Snow", 282),
                    new WeatherInfo("2013-01-23", -3, -9, -15, -4, -9, -16, 100, 95, 85, 1011, 1010, 1008, 10, 7, 0, 13, 6, 0, 0.00f, 4, "Fog-Snow", 300),
                    new WeatherInfo("2013-01-24", -7, -12, -19, -7, -14, -20, 100, 92, 85, 1016, 1011, 1009, 10, 9, 0, 11, 5, 0, 0.00f, 1, "Fog-Snow", 314),
                    new WeatherInfo("2013-01-25", -6, -13, -20, -7, -11, -22, 100, 92, 85, 1016, 1014, 1012, 10, 10, 10, 14, 6, 0, 0.00f, 5, "Snow", 248),
                    new WeatherInfo("2013-01-26", -1, -6, -9, -3, -6, -10, 100, 92, 80, 1012, 1010, 1008, 10, 9, 2, 23, 13, 0, 0.00f, 7, "Fog-Rain-Snow", 253),
                    new WeatherInfo("2013-01-27", -1, -3, -6, -3, -5, -7, 100, 89, 80, 1008, 1005, 1002, 10, 9, 5, 21, 14, 39, 0.00f, 8, "Snow", 213),
                    new WeatherInfo("2013-01-28", 2, -3, -6, 1, -3, -6, 100, 96, 93, 1002, 1000, 999, 10, 7, 1, 21, 16, 42, 0.00f, 8, "Rain-Snow", 201),
                    new WeatherInfo("2013-01-29", 2, 1, 0, 1, 0, -1, 100, 93, 87, 1001, 1001, 1000, 10, 9, 5, 14, 11, 35, 0.00f, 8, "Rain-Snow", 217),
                    new WeatherInfo("2013-01-30", 2, 1, 0, 2, 0, -1, 100, 96, 93, 1000, 989, 979, 10, 5, 1, 23, 16, 48, 0.00f, 7, "Fog-Rain-Snow", 194),
                    new WeatherInfo("2013-01-31", 2, 1, 0, 1, 1, -1, 100, 95, 87, 983, 980, 979, 10, 9, 2, 14, 11, 0, 0.00f, 8, "Rain-Snow", 236),
                    new WeatherInfo("2013-02-01", 0, -3, -7, -2, -3, -8, 100, 95, 86, 991, 989, 984, 10, 10, 10, 16, 10, 0, 0.00f, 5, "", 277),
                    new WeatherInfo("2013-02-02", -1, -6, -10, -2, -4, -10, 100, 98, 93, 999, 994, 991, 10, 7, 0, 11, 6, 0, 0.00f, 8, "Fog-Snow", 181),
                    new WeatherInfo("2013-02-03", -2, -6, -9, -4, -5, -10, 100, 94, 86, 1001, 1000, 999, 10, 9, 0, 8, 5, 0, 0.00f, 5, "Fog-Snow", 197),
                    new WeatherInfo("2013-02-04", 0, -2, -4, -1, -3, -5, 100, 93, 86, 999, 994, 987, 10, 9, 3, 24, 10, 40, 0.00f, 7, "Snow", 176),
                    new WeatherInfo("2013-02-05", -1, -2, -2, -1, -2, -3, 100, 96, 93, 991, 986, 983, 10, 6, 2, 26, 19, 0, 0.00f, 8, "Rain-Snow", 135),
                    new WeatherInfo("2013-02-06", 0, -2, -2, -1, -2, -3, 100, 97, 93, 1001, 995, 991, 10, 9, 5, 27, 18, 0, 0.00f, 8, "Snow", 103),
                    new WeatherInfo("2013-02-07", 0, -2, -4, -1, -2, -5, 100, 95, 93, 1014, 1008, 1001, 10, 10, 10, 19, 10, 0, 0.00f, 6, "Fog-Snow", 109),
                    new WeatherInfo("2013-02-08", -4, -6, -7, -4, -6, -7, 100, 96, 93, 1015, 1014, 1013, 10, 5, 1, 23, 13, 0, 0.00f, 7, "Fog-Snow", 70),
                    new WeatherInfo("2013-02-09", -2, -6, -9, -3, -4, -9, 100, 95, 86, 1016, 1015, 1013, 10, 9, 1, 16, 13, 0, 0.00f, 8, "Fog-Snow", 67),
                    new WeatherInfo("2013-02-10", 0, -4, -9, -1, -3, -9, 100, 97, 93, 1015, 1012, 1010, 10, 7, 1, 11, 6, 0, 0.00f, 7, "Snow", 32),
                    new WeatherInfo("2013-02-11", -1, -2, -3, -2, -2, -3, 100, 97, 93, 1020, 1014, 1010, 10, 7, 3, 11, 6, 0, 0.00f, 8, "Rain-Snow", 44),
                    new WeatherInfo("2013-02-12", -1, -2, -3, -2, -3, -4, 100, 96, 86, 1024, 1022, 1020, 10, 8, 1, 26, 8, 0, 0.00f, 8, "Fog-Snow", 109),
                    new WeatherInfo("2013-02-13", 0, -1, -2, -1, -2, -3, 100, 93, 86, 1032, 1029, 1024, 10, 10, 5, 13, 10, 0, 0.00f, 7, "Snow", 144),
                    new WeatherInfo("2013-02-14", 0, 0, 0, 0, -1, -1, 100, 98, 93, 1032, 1030, 1028, 10, 6, 1, 13, 11, 0, 0.00f, 8, "Fog-Rain-Snow", 151),
                    new WeatherInfo("2013-02-15", -1, -2, -2, -1, -3, -3, 100, 91, 86, 1028, 1027, 1027, 10, 10, 10, 11, 6, 0, 0.00f, 8, "Snow", 149),
                    new WeatherInfo("2013-02-16", -1, -2, -3, -1, -3, -4, 100, 93, 86, 1027, 1026, 1024, 10, 10, 5, 10, 5, 0, 0.00f, 8, "Snow", 187),
                    new WeatherInfo("2013-02-17", 0, -1, -1, 0, -1, -1, 100, 96, 93, 1024, 1020, 1016, 10, 6, 2, 10, 6, 0, 0.00f, 8, "Rain-Snow", 235),
                    new WeatherInfo("2013-02-18", 0, -1, -2, -1, -2, -3, 100, 98, 93, 1016, 1013, 1012, 10, 7, 2, 19, 6, 0, 0.00f, 8, "Rain-Snow", 81),
                    new WeatherInfo("2013-02-19", -1, -3, -6, -3, -5, -8, 100, 89, 80, 1026, 1020, 1015, 10, 10, 6, 23, 16, 0, 0.00f, 6, "Snow", 71),
                    new WeatherInfo("2013-02-20", -4, -7, -10, -6, -7, -11, 100, 84, 74, 1029, 1028, 1026, 10, 10, 10, 23, 13, 0, 0.00f, 7, "Snow", 57),
                    new WeatherInfo("2013-02-21", -5, -11, -17, -6, -11, -18, 100, 91, 80, 1029, 1027, 1022, 10, 10, 10, 11, 6, 0, 0.00f, 3, "Fog-Snow", 213),
                    new WeatherInfo("2013-02-22", 1, -2, -5, -2, -3, -6, 100, 92, 81, 1026, 1023, 1021, 10, 10, 8, 8, 5, 0, 0.00f, 7, "Snow", 221),
                    new WeatherInfo("2013-02-23", -1, -2, -4, -2, -3, -5, 100, 92, 86, 1030, 1029, 1026, 10, 9, 1, 11, 5, 0, 0.00f, 8, "Fog-Snow", 222),
                    new WeatherInfo("2013-02-24", -1, -7, -12, -5, -7, -13, 100, 87, 69, 1033, 1031, 1030, 10, 10, 9, 10, 5, 0, 0.00f, 8, "Fog", 257),
                    new WeatherInfo("2013-02-25", 2, -7, -15, -3, -9, -16, 100, 87, 65, 1034, 1034, 1033, 10, 9, 0, 10, 3, 0, 0.00f, 4, "Fog-Snow", 233),
                    new WeatherInfo("2013-02-26", 2, -4, -11, -1, -5, -12, 100, 89, 75, 1034, 1028, 1024, 10, 6, 0, 24, 6, 0, 0.00f, 2, "Fog", 284),
                    new WeatherInfo("2013-02-27", 6, 2, -1, 1, -1, -3, 100, 87, 70, 1025, 1022, 1017, 10, 10, 10, 21, 10, 0, 0.00f, 2, "", 308),
                    new WeatherInfo("2013-02-28", 5, 2, -1, 0, -1, -2, 100, 77, 65, 1016, 1005, 994, 10, 10, 6, 27, 14, 0, 0.00f, 5, "Rain-Snow", 291),
                    new WeatherInfo("2013-03-01", 2, -3, -7, 0, -3, -13, 100, 81, 63, 1015, 1003, 994, 10, 10, 6, 26, 19, 0, 0.00f, 8, "Rain-Snow", 7),
                    new WeatherInfo("2013-03-02", -4, -10, -16, -5, -11, -17, 100, 82, 53, 1015, 1004, 987, 10, 6, 1, 24, 10, 45, 0.00f, 6, "Snow", 161),
                    new WeatherInfo("2013-03-03", -5, -11, -19, -6, -11, -20, 100, 87, 68, 1015, 1002, 986, 10, 6, 2, 34, 18, 0, 0.00f, 7, "Fog-Snow", 72),
                    new WeatherInfo("2013-03-04", -2, -11, -21, -3, -11, -23, 100, 92, 84, 1017, 1014, 1010, 10, 5, 1, 16, 6, 0, 0.00f, 8, "Fog-Snow", 145),
                    new WeatherInfo("2013-03-05", 0, -2, -5, 0, -2, -5, 100, 98, 93, 1012, 1010, 1004, 10, 7, 0, 14, 10, 0, 0.00f, 8, "Fog", 181),
                    new WeatherInfo("2013-03-06", 3, -1, -5, 0, -3, -10, 100, 84, 65, 1009, 1001, 998, 10, 9, 3, 39, 14, 64, 0.00f, 5, "Fog-Snow", 290),
                    new WeatherInfo("2013-03-07", -1, -8, -15, -8, -10, -16, 92, 71, 55, 1021, 1013, 1009, 10, 10, 10, 32, 14, 0, 0.00f, 2, "", 324),
                    new WeatherInfo("2013-03-08", -1, -11, -20, -4, -13, -22, 93, 77, 37, 1022, 1021, 1019, 10, 9, 1, 27, 8, 0, 0.00f, 5, "Snow", 318),
                    new WeatherInfo("2013-03-09", -5, -12, -20, -12, -17, -22, 100, 72, 39, 1022, 1021, 1021, 10, 10, 10, 19, 6, 0, 0.00f, 1, "Snow", 8),
                    new WeatherInfo("2013-03-10", -5, -14, -23, -13, -18, -25, 92, 72, 36, 1022, 1020, 1016, 10, 10, 10, 14, 3, 0, 0.00f, 0, "Snow", 307),
                    new WeatherInfo("2013-03-11", -2, -6, -10, -5, -9, -13, 93, 80, 73, 1015, 1010, 1008, 10, 9, 3, 16, 11, 0, 0.00f, 6, "Rain-Snow", 276),
                    new WeatherInfo("2013-03-12", -1, -7, -13, -3, -7, -14, 100, 85, 60, 1007, 1003, 999, 10, 9, 1, 21, 8, 35, 0.00f, 5, "Fog-Snow", 211),
                    new WeatherInfo("2013-03-13", -3, -12, -20, -4, -13, -22, 100, 76, 30, 1007, 1003, 999, 10, 10, 7, 23, 11, 0, 0.00f, 5, "Snow", 328),
                    new WeatherInfo("2013-03-14", -5, -13, -22, -9, -16, -24, 92, 77, 46, 1012, 1008, 1006, 10, 10, 9, 26, 6, 0, 0.00f, 4, "Snow", 276),
                    new WeatherInfo("2013-03-15", -2, -11, -21, -10, -17, -23, 92, 70, 31, 1015, 1013, 1012, 10, 10, 10, 16, 5, 0, 0.00f, 0, "", 271),
                    new WeatherInfo("2013-03-16", 0, -11, -22, -11, -17, -24, 92, 65, 25, 1019, 1016, 1014, 10, 10, 10, 19, 3, 0, 0.00f, 0, "Snow", 261),
                    new WeatherInfo("2013-03-17", 0, -9, -18, -7, -13, -20, 93, 76, 44, 1027, 1023, 1019, 10, 10, 10, 13, 6, 0, 0.00f, 2, "Fog-Snow", 113),
                    new WeatherInfo("2013-03-18", -5, -11, -18, -13, -17, -22, 85, 64, 46, 1028, 1025, 1021, 10, 10, 10, 24, 13, 0, 0.00f, 4, "Snow", 97),
                    new WeatherInfo("2013-03-19", -4, -9, -13, -12, -14, -16, 92, 66, 46, 1021, 1018, 1016, 10, 9, 0, 27, 18, 0, 0.00f, 4, "Snow", 93),
                    new WeatherInfo("2013-03-20", 0, -4, -8, -13, -15, -17, 58, 44, 29, 1024, 1019, 1016, 10, 9, 1, 39, 23, 0, 0.00f, 4, "Fog-Rain-Snow", 84),
                    new WeatherInfo("2013-03-21", -3, -9, -14, -11, -15, -18, 79, 58, 36, 1029, 1027, 1024, 10, 10, 10, 26, 14, 0, 0.00f, 1, "", 68),
                    new WeatherInfo("2013-03-22", -5, -10, -14, -8, -14, -17, 93, 71, 43, 1034, 1031, 1030, 10, 10, 10, 19, 11, 0, 0.00f, 5, "Rain-Snow", 32),
                    new WeatherInfo("2013-03-23", 0, -5, -12, -7, -9, -13, 100, 73, 47, 1031, 1029, 1028, 10, 10, 10, 21, 8, 0, 0.00f, 3, "Snow", 18),
                    new WeatherInfo("2013-03-24", 2, -7, -14, -5, -10, -15, 92, 70, 38, 1032, 1030, 1029, 10, 10, 10, 16, 5, 0, 0.00f, 2, "", 21),
                    new WeatherInfo("2013-03-25", 3, -6, -13, -5, -8, -14, 100, 73, 45, 1029, 1027, 1024, 10, 10, 10, 23, 6, 0, 0.00f, 1, "", 330),
                    new WeatherInfo("2013-03-26", 2, -6, -12, -7, -11, -15, 93, 64, 28, 1024, 1023, 1021, 0, 0, 0, 19, 6, 0, 0.00f, 0, "", 39),
                    new WeatherInfo("2013-03-27", 3, -6, -15, -4, -9, -16, 92, 74, 48, 1022, 1021, 1020, 0, 0, 0, 16, 5, 0, 0.00f, 0, "", 239),
                    new WeatherInfo("2013-03-28", 3, -1, -5, -3, -5, -7, 93, 78, 56, 1023, 1021, 1020, 10, 10, 10, 16, 8, 0, 0.00f, 1, "", 240),
                    new WeatherInfo("2013-03-29", 2, -4, -9, -3, -8, -13, 100, 75, 33, 1023, 1021, 1017, 10, 7, 0, 13, 5, 0, 0.00f, 5, "Fog-Snow", 117),
                    new WeatherInfo("2013-03-30", 2, -3, -8, -9, -12, -13, 80, 54, 33, 1016, 1011, 1009, 0, 0, 0, 23, 11, 0, 0.00f, 0, "", 68),
                    new WeatherInfo("2013-03-31", 8, -1, -10, -8, -11, -14, 86, 56, 20, 1014, 1013, 1010, 0, 0, 0, 10, 5, 0, 0.00f, 0, "", 97),
                    new WeatherInfo("2013-04-01", 3, -4, -12, -6, -9, -13, 93, 69, 41, 1014, 1012, 1010, 10, 10, 10, 21, 6, 0, 0.00f, 1, "", 79),
                    new WeatherInfo("2013-04-02", 4, -3, -10, -4, -7, -12, 93, 69, 45, 1018, 1013, 1010, 10, 10, 10, 24, 8, 0, 0.00f, 1, "", 329),
                    new WeatherInfo("2013-04-03", 5, -2, -9, -3, -6, -10, 100, 71, 36, 1025, 1023, 1019, 10, 9, 8, 16, 8, 0, 0.00f, 1, "Fog", 305),
                    new WeatherInfo("2013-04-04", 6, -1, -7, -6, -8, -10, 93, 60, 31, 1025, 1024, 1022, 0, 0, 0, 16, 5, 0, 0.00f, 0, "", 248),
                    new WeatherInfo("2013-04-05", 6, -1, -7, -6, -8, -11, 93, 59, 31, 1021, 1017, 1014, 10, 10, 10, 19, 6, 0, 0.00f, 2, "", 36),
                    new WeatherInfo("2013-04-06", 5, 0, -5, -7, -9, -13, 86, 56, 26, 1016, 1014, 1013, 0, 0, 0, 13, 8, 0, 0.00f, 0, "", 44),
                    new WeatherInfo("2013-04-07", 2, -3, -7, 1, -4, -9, 100, 88, 74, 1013, 1008, 1006, 10, 7, 0, 16, 6, 0, 0.00f, 5, "Fog-Rain-Snow", 191),
                    new WeatherInfo("2013-04-08", 3, -3, -9, -2, -6, -9, 100, 86, 52, 1011, 1007, 1005, 10, 9, 1, 11, 3, 0, 0.00f, 5, "Fog-Rain-Snow", 93),
                    new WeatherInfo("2013-04-09", 6, -2, -10, 0, -9, -12, 100, 70, 34, 1018, 1015, 1011, 10, 6, 0, 13, 3, 0, 0.00f, 2, "Fog-Snow", 269),
                    new WeatherInfo("2013-04-10", 5, -3, -11, -4, -8, -12, 100, 72, 36, 1020, 1019, 1018, 10, 7, 0, 11, 5, 0, 0.00f, 3, "Fog", 110),
                    new WeatherInfo("2013-04-11", 5, -1, -6, -1, -6, -9, 81, 68, 36, 1018, 1015, 1011, 10, 10, 10, 19, 10, 0, 0.00f, 4, "", 98),
                    new WeatherInfo("2013-04-12", 6, 3, 1, 2, 1, -1, 93, 84, 70, 1011, 1009, 1006, 10, 10, 6, 24, 13, 0, 0.00f, 7, "Rain", 102),
                    new WeatherInfo("2013-04-13", 3, 2, 1, 3, 2, 1, 100, 97, 87, 1007, 1002, 999, 10, 6, 1, 23, 18, 52, 0.00f, 8, "Fog-Rain-Snow", 151),
                    new WeatherInfo("2013-04-14", 8, 4, 0, 3, 0, -2, 100, 82, 50, 1024, 1018, 1008, 10, 8, 1, 16, 11, 0, 0.00f, 7, "Fog-Rain", 286),
                    new WeatherInfo("2013-04-15", 4, 2, 0, 3, 2, -1, 100, 93, 87, 1024, 1022, 1019, 10, 9, 5, 16, 11, 35, 0.00f, 7, "Rain", 216),
                    new WeatherInfo("2013-04-16", 6, 4, 4, 3, 2, 2, 93, 87, 81, 1020, 1019, 1015, 10, 10, 8, 16, 13, 0, 0.00f, 6, "Rain", 208),
                    new WeatherInfo("2013-04-17", 10, 7, 3, 5, 3, 0, 100, 81, 66, 1015, 1009, 1007, 10, 8, 1, 19, 13, 39, 0.00f, 5, "Fog-Rain", 224),
                    new WeatherInfo("2013-04-18", 9, 6, 3, 7, 2, -1, 100, 83, 66, 1011, 1006, 998, 10, 8, 2, 23, 11, 50, 0.00f, 6, "Rain", 225),
                    new WeatherInfo("2013-04-19", 6, 4, 3, 4, 3, 2, 100, 87, 81, 1009, 1002, 997, 10, 10, 7, 26, 13, 39, 0.00f, 7, "Rain", 241),
                    new WeatherInfo("2013-04-20", 7, 3, -1, 3, -2, -7, 100, 68, 39, 1027, 1019, 1009, 10, 9, 5, 29, 13, 0, 0.00f, 4, "Rain", 325),
                    new WeatherInfo("2013-04-21", 10, 2, -5, 0, -3, -7, 100, 66, 32, 1028, 1026, 1023, 0, 0, 0, 19, 6, 0, 0.00f, 0, "", 232),
                    new WeatherInfo("2013-04-22", 9, 4, -1, -1, -3, -6, 93, 58, 34, 1023, 1019, 1010, 10, 10, 10, 21, 10, 0, 0.00f, 3, "", 187),
                    new WeatherInfo("2013-04-23", 6, 4, 3, 4, 2, -2, 93, 80, 57, 1010, 1002, 997, 10, 9, 5, 19, 11, 39, 0.00f, 5, "Rain", 204),
                    new WeatherInfo("2013-04-24", 11, 6, 2, 3, 0, -4, 93, 65, 38, 1007, 1002, 997, 10, 10, 10, 29, 13, 45, 0.00f, 2, "Rain", 274),
                    new WeatherInfo("2013-04-25", 10, 6, 1, 2, -1, -5, 93, 63, 37, 1014, 1010, 1003, 10, 10, 10, 29, 13, 45, 0.00f, 2, "", 296),
                    new WeatherInfo("2013-04-26", 7, 3, 0, 3, 1, -4, 93, 82, 65, 1013, 1004, 1000, 10, 9, 6, 16, 8, 0, 0.00f, 6, "Rain", 216),
                    new WeatherInfo("2013-04-27", 9, 4, 1, 2, 1, -2, 100, 79, 46, 1008, 1005, 1002, 10, 9, 1, 23, 11, 0, 0.00f, 6, "Fog", 312),
                    new WeatherInfo("2013-04-28", 10, 4, -1, 0, -1, -3, 100, 74, 40, 1013, 1011, 1008, 10, 6, 0, 19, 10, 0, 0.00f, 6, "Fog", 270),
                    new WeatherInfo("2013-04-29", 9, 6, 3, 4, 1, -3, 100, 79, 58, 1013, 1011, 1004, 10, 10, 7, 21, 13, 39, 0.00f, 6, "Rain", 201),
                    new WeatherInfo("2013-04-30", 9, 6, 3, 4, 2, 1, 100, 84, 66, 1010, 1005, 1003, 10, 9, 6, 32, 13, 48, 0.00f, 5, "Rain", 247),
                    new WeatherInfo("2013-05-01", 10, 5, 0, 1, -3, -12, 93, 59, 25, 1022, 1019, 1010, 10, 10, 10, 26, 11, 0, 0.00f, 1, "", 291),
                    new WeatherInfo("2013-05-02", 9, 4, 1, 1, 0, -2, 100, 71, 50, 1021, 1017, 1015, 10, 10, 10, 32, 13, 45, 0.00f, 4, "", 236),
                    new WeatherInfo("2013-05-03", 11, 3, -3, 0, -4, -7, 93, 56, 28, 1020, 1018, 1015, 10, 10, 10, 24, 8, 0, 0.00f, 3, "", 245),
                    new WeatherInfo("2013-05-04", 13, 8, 3, 1, -2, -5, 70, 53, 35, 1015, 1012, 1009, 10, 10, 10, 23, 10, 0, 0.00f, 3, "Rain", 224),
                    new WeatherInfo("2013-05-05", 9, 6, 3, 3, 1, -1, 81, 67, 53, 1020, 1010, 1004, 10, 10, 10, 34, 16, 48, 0.00f, 6, "Rain", 286),
                    new WeatherInfo("2013-05-06", 14, 6, -3, 3, 0, -4, 100, 65, 31, 1024, 1022, 1020, 10, 10, 10, 19, 8, 0, 0.00f, 1, "", 208),
                    new WeatherInfo("2013-05-07", 17, 11, 5, 7, 5, 3, 87, 68, 52, 1021, 1019, 1018, 10, 10, 10, 23, 11, 0, 0.00f, 1, "", 236),
                    new WeatherInfo("2013-05-08", 20, 12, 5, 7, 5, 3, 93, 64, 37, 1025, 1023, 1020, 10, 10, 9, 14, 6, 0, 0.00f, 3, "Rain", 132),
                    new WeatherInfo("2013-05-09", 17, 13, 10, 11, 9, 3, 94, 77, 51, 1019, 1012, 1008, 10, 9, 5, 23, 13, 0, 0.00f, 5, "Rain", 179),
                    new WeatherInfo("2013-05-10", 16, 12, 8, 11, 9, 8, 100, 88, 72, 1009, 1008, 1006, 10, 4, 0, 16, 6, 0, 0.00f, 7, "Fog", 237),
                    new WeatherInfo("2013-05-11", 16, 11, 6, 9, 6, 3, 100, 77, 45, 1011, 1009, 1008, 10, 6, 0, 23, 8, 0, 0.00f, 3, "Fog", 261),
                    new WeatherInfo("2013-05-12", 15, 9, 3, 6, 4, 2, 100, 70, 45, 1012, 1011, 1011, 10, 10, 9, 16, 6, 0, 0.00f, 3, "", 211),
                    new WeatherInfo("2013-05-13", 17, 11, 5, 6, 4, 1, 93, 62, 34, 1012, 1009, 1007, 10, 10, 9, 14, 6, 0, 0.00f, 2, "", 222),
                    new WeatherInfo("2013-05-14", 13, 9, 5, 7, 5, 3, 100, 78, 54, 1011, 1008, 1006, 10, 9, 3, 19, 10, 0, 0.00f, 5, "Rain", 202),
                    new WeatherInfo("2013-05-15", 13, 7, 2, 5, 4, 1, 100, 78, 54, 1017, 1015, 1011, 10, 10, 10, 13, 8, 0, 0.00f, 6, "", 243),
                    new WeatherInfo("2013-05-16", 22, 11, 1, 6, 2, -2, 100, 55, 23, 1018, 1017, 1016, 9, 8, 5, 19, 6, 0, 0.00f, 0, "", 109),
                    new WeatherInfo("2013-05-17", 25, 16, 7, 15, 8, 2, 77, 53, 27, 1018, 1017, 1016, 10, 10, 10, 29, 14, 0, 0.00f, 2, "Rain-Thunderstorm", 109),
                    new WeatherInfo("2013-05-18", 22, 17, 12, 14, 12, 10, 88, 72, 57, 1017, 1016, 1015, 10, 10, 10, 21, 14, 0, 0.00f, 5, "", 91),
                    new WeatherInfo("2013-05-19", 21, 17, 14, 17, 14, 12, 94, 80, 64, 1015, 1013, 1013, 10, 10, 4, 21, 10, 0, 0.00f, 3, "Rain", 102),
                    new WeatherInfo("2013-05-20", 20, 15, 10, 16, 13, 10, 100, 85, 73, 1015, 1014, 1013, 10, 8, 0, 23, 8, 0, 0.00f, 6, "Fog", 104),
                    new WeatherInfo("2013-05-21", 23, 17, 12, 12, 9, 6, 94, 59, 36, 1013, 1009, 1007, 10, 10, 10, 32, 19, 50, 0.00f, 1, "", 118),
                    new WeatherInfo("2013-05-22", 15, 12, 10, 11, 8, 3, 100, 74, 51, 1006, 1004, 1003, 10, 9, 2, 29, 18, 0, 0.00f, 6, "Rain", 118),
                    new WeatherInfo("2013-05-23", 12, 11, 10, 11, 9, 8, 100, 90, 77, 1008, 1005, 1004, 10, 9, 1, 19, 10, 0, 0.00f, 8, "Fog-Rain", 105),
                    new WeatherInfo("2013-05-24", 18, 14, 10, 10, 9, 7, 94, 75, 56, 1011, 1010, 1008, 10, 10, 10, 13, 6, 0, 0.00f, 6, "", 80),
                    new WeatherInfo("2013-05-25", 21, 14, 9, 10, 7, 2, 93, 61, 28, 1012, 1010, 1008, 10, 10, 10, 27, 13, 0, 0.00f, 2, "", 70),
                    new WeatherInfo("2013-05-26", 21, 16, 10, 11, 7, 5, 94, 58, 35, 1013, 1010, 1009, 10, 10, 8, 40, 18, 53, 0.00f, 4, "Rain", 99),
                    new WeatherInfo("2013-05-27", 21, 16, 12, 12, 11, 7, 94, 72, 40, 1016, 1015, 1013, 10, 10, 10, 21, 10, 0, 0.00f, 5, "Rain", 133),
                    new WeatherInfo("2013-05-28", 24, 18, 12, 11, 7, 3, 77, 51, 27, 1016, 1015, 1014, 10, 10, 10, 34, 16, 48, 0.00f, 2, "", 109),
                    new WeatherInfo("2013-05-29", 25, 19, 13, 12, 9, 5, 63, 52, 41, 1015, 1012, 1010, 10, 10, 10, 29, 14, 0, 0.00f, 2, "Rain", 101),
                    new WeatherInfo("2013-05-30", 22, 17, 13, 13, 9, 6, 77, 56, 41, 1013, 1011, 1010, 10, 10, 10, 21, 10, 0, 0.00f, 2, "", 120),
                    new WeatherInfo("2013-05-31", 24, 17, 10, 15, 11, 7, 94, 72, 34, 1013, 1013, 1012, 10, 9, 0, 21, 8, 32, 0.00f, 2, "Fog-Rain-Thunderstorm", 103),
                    new WeatherInfo("2013-06-01", 25, 18, 12, 15, 13, 11, 94, 71, 47, 1013, 1013, 1012, 10, 10, 8, 21, 10, 0, 0.00f, 2, "Fog-Rain", 118),
                    new WeatherInfo("2013-06-02", 28, 21, 14, 15, 11, 9, 77, 54, 30, 1016, 1014, 1013, 10, 10, 10, 16, 11, 0, 0.00f, 1, "", 158),
                    new WeatherInfo("2013-06-03", 27, 19, 12, 15, 12, 7, 88, 62, 28, 1017, 1015, 1015, 10, 10, 10, 21, 8, 0, 0.00f, 3, "", 159),
                    new WeatherInfo("2013-06-04", 22, 17, 12, 13, 12, 9, 88, 77, 50, 1018, 1016, 1015, 10, 10, 10, 16, 11, 0, 0.00f, 6, "Rain", 354),
                    new WeatherInfo("2013-06-05", 24, 18, 12, 14, 13, 12, 100, 77, 47, 1022, 1020, 1017, 10, 6, 0, 21, 8, 0, 0.00f, 4, "Fog-Rain", 324),
                    new WeatherInfo("2013-06-06", 25, 18, 12, 15, 12, 10, 100, 69, 44, 1022, 1021, 1020, 10, 5, 0, 14, 8, 0, 0.00f, 5, "Fog", 335),
                    new WeatherInfo("2013-06-07", 24, 18, 12, 10, 6, 0, 82, 51, 24, 1020, 1018, 1015, 10, 10, 10, 19, 8, 0, 0.00f, 2, "", 300),
                    new WeatherInfo("2013-06-08", 22, 16, 10, 11, 8, 4, 87, 59, 33, 1014, 1011, 1010, 10, 10, 10, 23, 8, 0, 0.00f, 1, "", 263),
                    new WeatherInfo("2013-06-09", 20, 13, 6, 8, 6, 3, 93, 60, 33, 1010, 1008, 1006, 10, 10, 10, 19, 8, 27, 0.00f, 3, "", 16),
                    new WeatherInfo("2013-06-10", 15, 11, 7, 12, 9, 6, 93, 82, 67, 1007, 1005, 1003, 10, 10, 10, 19, 6, 0, 0.00f, 4, "Rain-Thunderstorm", 7),
                    new WeatherInfo("2013-06-11", 17, 13, 10, 12, 9, 8, 100, 81, 59, 1012, 1007, 1003, 10, 10, 10, 24, 14, 0, 0.00f, 6, "Rain", 333),
                    new WeatherInfo("2013-06-12", 20, 14, 9, 12, 10, 8, 100, 77, 52, 1016, 1014, 1012, 10, 10, 10, 14, 6, 0, 0.00f, 4, "Rain", 212),
                    new WeatherInfo("2013-06-13", 20, 16, 11, 14, 12, 10, 100, 86, 56, 1016, 1013, 1006, 10, 9, 5, 21, 10, 40, 0.00f, 5, "Rain", 171),
                    new WeatherInfo("2013-06-14", 14, 13, 13, 14, 13, 12, 100, 98, 94, 1006, 1004, 1003, 10, 8, 1, 21, 14, 40, 0.00f, 8, "Fog-Rain", 230),
                    new WeatherInfo("2013-06-15", 18, 14, 12, 12, 11, 8, 94, 75, 55, 1011, 1008, 1003, 10, 10, 10, 23, 14, 35, 0.00f, 4, "", 260),
                    new WeatherInfo("2013-06-16", 15, 12, 10, 12, 11, 9, 100, 90, 77, 1011, 1007, 1004, 10, 10, 6, 21, 10, 37, 0.00f, 4, "Rain", 198),
                    new WeatherInfo("2013-06-17", 16, 13, 10, 11, 10, 9, 100, 83, 63, 1013, 1007, 1004, 10, 10, 10, 29, 13, 0, 0.00f, 5, "Rain", 274),
                    new WeatherInfo("2013-06-18", 19, 12, 6, 10, 7, 3, 100, 68, 40, 1018, 1015, 1013, 10, 10, 8, 23, 6, 0, 0.00f, 2, "Fog-Rain", 334),
                    new WeatherInfo("2013-06-19", 20, 11, 3, 8, 6, 3, 100, 61, 33, 1021, 1020, 1019, 10, 8, 1, 14, 6, 0, 0.00f, 2, "Fog", 320),
                    new WeatherInfo("2013-06-20", 18, 13, 8, 14, 11, 6, 100, 82, 64, 1020, 1016, 1014, 10, 10, 6, 19, 8, 37, 0.00f, 6, "Rain", 187),
                    new WeatherInfo("2013-06-21", 25, 17, 9, 15, 12, 9, 100, 78, 50, 1017, 1015, 1011, 10, 8, 0, 23, 10, 0, 0.00f, 4, "Fog", 98),
                    new WeatherInfo("2013-06-22", 21, 18, 16, 18, 16, 14, 100, 81, 64, 1011, 1009, 1008, 10, 10, 10, 21, 16, 39, 0.00f, 5, "Rain-Thunderstorm", 193),
                    new WeatherInfo("2013-06-23", 22, 18, 14, 15, 14, 12, 94, 75, 57, 1013, 1011, 1009, 10, 10, 10, 19, 10, 0, 0.00f, 3, "", 229),
                    new WeatherInfo("2013-06-24", 24, 18, 12, 16, 14, 11, 100, 78, 53, 1015, 1015, 1013, 10, 9, 4, 13, 6, 0, 0.00f, 2, "Rain", 147),
                    new WeatherInfo("2013-06-25", 26, 21, 16, 17, 15, 12, 100, 68, 42, 1016, 1015, 1015, 10, 10, 6, 16, 5, 32, 0.00f, 3, "Rain", 333),
                    new WeatherInfo("2013-06-26", 30, 23, 16, 19, 17, 13, 94, 66, 37, 1016, 1014, 1013, 10, 10, 10, 24, 11, 0, 0.00f, 2, "Thunderstorm", 119),
                    new WeatherInfo("2013-06-27", 24, 19, 15, 20, 17, 13, 100, 84, 73, 1018, 1015, 1013, 10, 10, 10, 21, 8, 0, 0.00f, 4, "Rain", 248),
                    new WeatherInfo("2013-06-28", 19, 17, 14, 14, 12, 7, 100, 76, 49, 1021, 1019, 1018, 10, 10, 10, 19, 10, 0, 0.00f, 4, "", 227),
                    new WeatherInfo("2013-06-29", 17, 14, 13, 13, 12, 10, 100, 84, 68, 1017, 1013, 1011, 10, 10, 2, 11, 5, 0, 0.00f, 6, "Rain", 287),
                    new WeatherInfo("2013-06-30", 21, 14, 9, 13, 12, 8, 100, 75, 53, 1011, 1011, 1011, 10, 9, 0, 14, 5, 0, 0.00f, 3, "Fog", 277),
                    new WeatherInfo("2013-07-01", 21, 14, 8, 14, 11, 8, 100, 75, 56, 1011, 1009, 1008, 10, 9, 4, 19, 6, 0, 0.00f, 4, "Rain", 272),
                    new WeatherInfo("2013-07-02", 21, 17, 13, 14, 12, 10, 94, 76, 60, 1013, 1011, 1008, 10, 10, 10, 19, 10, 37, 0.00f, 4, "", 217),
                    new WeatherInfo("2013-07-03", 20, 16, 11, 13, 11, 9, 94, 68, 49, 1018, 1015, 1013, 10, 10, 10, 16, 10, 39, 0.00f, 3, "", 220),
                    new WeatherInfo("2013-07-04", 21, 14, 8, 14, 11, 7, 100, 74, 46, 1020, 1019, 1018, 10, 8, 0, 13, 6, 0, 0.00f, 3, "Fog-Rain", 185),
                    new WeatherInfo("2013-07-05", 24, 18, 12, 17, 15, 11, 94, 81, 61, 1019, 1018, 1017, 10, 10, 6, 19, 6, 0, 0.00f, 4, "Rain", 224),
                    new WeatherInfo("2013-07-06", 20, 17, 13, 16, 12, 7, 88, 70, 46, 1025, 1022, 1019, 10, 10, 10, 27, 13, 37, 0.00f, 5, "", 316),
                    new WeatherInfo("2013-07-07", 23, 17, 11, 12, 9, 6, 94, 62, 33, 1026, 1025, 1023, 10, 10, 10, 16, 10, 0, 0.00f, 1, "", 307),
                    new WeatherInfo("2013-07-08", 20, 17, 12, 15, 11, 6, 100, 71, 43, 1026, 1024, 1021, 10, 8, 0, 26, 11, 42, 0.00f, 4, "Fog", 12),
                    new WeatherInfo("2013-07-09", 22, 14, 8, 13, 8, 2, 94, 65, 28, 1026, 1021, 1013, 10, 10, 10, 16, 11, 32, 0.00f, 1, "", 289),
                    new WeatherInfo("2013-07-10", 19, 17, 15, 16, 14, 12, 100, 86, 68, 1013, 1010, 1009, 10, 10, 9, 13, 10, 0, 0.00f, 5, "Rain", 306),
                    new WeatherInfo("2013-07-11", 20, 16, 11, 14, 8, 6, 94, 63, 43, 1016, 1014, 1012, 10, 10, 10, 26, 11, 0, 0.00f, 2, "", 14),
                    new WeatherInfo("2013-07-12", 24, 14, 6, 11, 7, 5, 93, 59, 31, 1017, 1017, 1016, 0, 0, 0, 16, 6, 0, 0.00f, 0, "", 19),
                    new WeatherInfo("2013-07-13", 26, 17, 9, 11, 9, 8, 94, 57, 36, 1018, 1016, 1013, 10, 10, 10, 19, 6, 0, 0.00f, 2, "", 296),
                    new WeatherInfo("2013-07-14", 24, 17, 10, 15, 11, 7, 94, 68, 36, 1013, 1010, 1008, 10, 10, 10, 23, 8, 0, 0.00f, 2, "Rain", 273),
                    new WeatherInfo("2013-07-15", 20, 13, 6, 13, 9, 4, 93, 68, 35, 1010, 1008, 1005, 10, 10, 10, 21, 8, 0, 0.00f, 2, "", 273),
                    new WeatherInfo("2013-07-16", 17, 14, 12, 14, 7, 4, 94, 62, 45, 1012, 1009, 1005, 10, 10, 10, 34, 16, 47, 0.00f, 3, "Rain", 312),
                    new WeatherInfo("2013-07-17", 19, 13, 8, 10, 7, 5, 93, 62, 43, 1015, 1013, 1012, 10, 10, 10, 26, 13, 47, 0.00f, 2, "", 311),
                    new WeatherInfo("2013-07-18", 22, 16, 11, 15, 11, 7, 94, 76, 53, 1015, 1012, 1009, 10, 10, 10, 23, 6, 0, 0.00f, 5, "Rain", 317),
                    new WeatherInfo("2013-07-19", 17, 13, 11, 12, 10, 8, 100, 77, 55, 1011, 1007, 1006, 10, 10, 10, 32, 14, 45, 0.00f, 5, "Rain", 332),
                    new WeatherInfo("2013-07-20", 19, 14, 10, 11, 9, 7, 100, 72, 46, 1014, 1013, 1011, 10, 10, 10, 27, 16, 0, 0.00f, 3, "Rain", 340),
                    new WeatherInfo("2013-07-21", 19, 16, 12, 13, 9, 5, 100, 70, 42, 1015, 1013, 1012, 10, 10, 7, 29, 14, 52, 0.00f, 4, "Rain", 335),
                    new WeatherInfo("2013-07-22", 19, 16, 12, 10, 9, 7, 82, 66, 49, 1015, 1014, 1013, 10, 10, 10, 29, 16, 52, 0.00f, 5, "", 6),
                    new WeatherInfo("2013-07-23", 22, 18, 14, 15, 13, 10, 88, 76, 60, 1013, 1012, 1011, 10, 10, 10, 24, 18, 0, 0.00f, 7, "", 39),
                    new WeatherInfo("2013-07-24", 25, 19, 14, 15, 14, 14, 100, 74, 54, 1015, 1014, 1013, 10, 10, 9, 21, 11, 0, 0.00f, 4, "Fog", 69),
                    new WeatherInfo("2013-07-25", 27, 20, 13, 16, 14, 12, 100, 71, 45, 1016, 1014, 1013, 10, 10, 7, 21, 8, 0, 0.00f, 5, "", 23),
                    new WeatherInfo("2013-07-26", 27, 20, 13, 17, 14, 12, 100, 76, 44, 1014, 1012, 1011, 10, 9, 1, 24, 8, 0, 0.00f, 2, "Fog-Rain-Thunderstorm", 309),
                    new WeatherInfo("2013-07-27", 27, 18, 10, 16, 12, 9, 100, 65, 34, 1013, 1012, 1011, 10, 10, 10, 19, 5, 0, 0.00f, 2, "Rain", 287),
                    new WeatherInfo("2013-07-28", 26, 18, 11, 16, 13, 11, 100, 74, 41, 1016, 1015, 1013, 10, 5, 0, 16, 5, 0, 0.00f, 6, "Fog", 243),
                    new WeatherInfo("2013-07-29", 24, 19, 14, 18, 16, 12, 100, 82, 53, 1017, 1015, 1014, 10, 10, 8, 16, 8, 0, 0.00f, 5, "Rain", 136),
                    new WeatherInfo("2013-07-30", 22, 19, 17, 19, 17, 16, 100, 90, 73, 1014, 1009, 1005, 10, 10, 9, 23, 13, 37, 0.00f, 6, "Rain", 134),
                    new WeatherInfo("2013-07-31", 21, 18, 15, 18, 15, 12, 100, 84, 56, 1008, 1007, 1003, 10, 10, 5, 23, 13, 0, 0.00f, 4, "Rain", 232),
                    new WeatherInfo("2013-08-01", 22, 18, 15, 15, 14, 11, 100, 80, 53, 1009, 1008, 1007, 10, 9, 3, 21, 6, 0, 0.00f, 5, "Rain-Thunderstorm", 291),
                    new WeatherInfo("2013-08-02", 25, 19, 13, 15, 13, 12, 100, 74, 47, 1015, 1012, 1009, 10, 10, 4, 21, 13, 0, 0.00f, 5, "", 339),
                    new WeatherInfo("2013-08-03", 25, 18, 12, 15, 14, 11, 100, 74, 50, 1018, 1017, 1016, 10, 9, 1, 13, 6, 0, 0.00f, 4, "Fog", 309),
                    new WeatherInfo("2013-08-04", 23, 17, 12, 17, 14, 11, 100, 80, 50, 1018, 1017, 1017, 10, 10, 6, 19, 6, 0, 0.00f, 3, "Fog-Rain", 211),
                    new WeatherInfo("2013-08-05", 25, 19, 13, 17, 13, 7, 100, 69, 32, 1020, 1018, 1017, 10, 9, 6, 21, 6, 35, 0.00f, 5, "", 288),
                    new WeatherInfo("2013-08-06", 24, 18, 12, 16, 11, 7, 94, 64, 34, 1020, 1019, 1016, 10, 10, 10, 16, 8, 0, 0.00f, 1, "", 216),
                    new WeatherInfo("2013-08-07", 24, 19, 15, 20, 16, 10, 100, 83, 63, 1016, 1014, 1013, 10, 9, 1, 21, 8, 0, 0.00f, 4, "Fog-Rain-Thunderstorm", 154),
                    new WeatherInfo("2013-08-08", 25, 21, 17, 19, 17, 14, 100, 82, 54, 1014, 1013, 1010, 10, 7, 0, 13, 5, 0, 0.00f, 5, "Fog-Rain", 313),
                    new WeatherInfo("2013-08-09", 20, 18, 16, 19, 17, 15, 100, 94, 83, 1011, 1008, 1007, 10, 9, 5, 21, 6, 0, 0.00f, 7, "Rain", 250),
                    new WeatherInfo("2013-08-10", 21, 17, 13, 16, 14, 13, 100, 79, 60, 1013, 1012, 1011, 10, 10, 10, 16, 13, 0, 0.00f, 5, "Rain", 281),
                    new WeatherInfo("2013-08-11", 22, 16, 9, 13, 12, 8, 100, 77, 50, 1012, 1008, 1004, 10, 9, 1, 19, 5, 0, 0.00f, 3, "Fog-Thunderstorm", 275),
                    new WeatherInfo("2013-08-12", 19, 14, 11, 15, 12, 10, 100, 86, 59, 1004, 1003, 1002, 10, 10, 7, 26, 10, 42, 0.00f, 4, "Rain", 211),
                    new WeatherInfo("2013-08-13", 20, 15, 10, 14, 11, 9, 100, 76, 52, 1006, 1005, 1004, 10, 10, 10, 16, 8, 37, 0.00f, 2, "Rain", 207),
                    new WeatherInfo("2013-08-14", 16, 13, 12, 15, 13, 12, 100, 96, 88, 1006, 1004, 1003, 10, 10, 10, 19, 10, 0, 0.00f, 6, "Rain", 302),
                    new WeatherInfo("2013-08-15", 19, 16, 11, 15, 13, 10, 100, 85, 68, 1015, 1010, 1005, 10, 10, 10, 29, 18, 0, 0.00f, 5, "Rain", 305),
                    new WeatherInfo("2013-08-16", 20, 13, 7, 14, 11, 7, 100, 76, 49, 1017, 1016, 1015, 10, 9, 0, 26, 8, 0, 0.00f, 2, "Fog", 254),
                    new WeatherInfo("2013-08-17", 18, 16, 14, 17, 16, 13, 100, 93, 82, 1017, 1013, 1012, 10, 9, 6, 14, 10, 37, 0.00f, 7, "Rain", 202),
                    new WeatherInfo("2013-08-18", 21, 18, 16, 17, 16, 15, 100, 88, 73, 1012, 1011, 1008, 10, 10, 10, 16, 8, 0, 0.00f, 5, "Rain", 191),
                    new WeatherInfo("2013-08-19", 19, 17, 14, 17, 14, 11, 100, 80, 60, 1015, 1010, 1007, 10, 9, 6, 23, 11, 0, 0.00f, 4, "Rain", 227),
                    new WeatherInfo("2013-08-20", 21, 16, 11, 15, 12, 8, 100, 76, 46, 1019, 1017, 1015, 10, 7, 0, 19, 8, 0, 0.00f, 1, "Fog", 226),
                    new WeatherInfo("2013-08-21", 22, 17, 12, 15, 12, 9, 100, 75, 43, 1018, 1017, 1017, 10, 8, 0, 19, 8, 0, 0.00f, 1, "Fog", 236),
                    new WeatherInfo("2013-08-22", 19, 14, 11, 15, 12, 8, 100, 84, 52, 1021, 1017, 1015, 10, 9, 5, 21, 8, 0, 0.00f, 4, "Rain", 353),
                    new WeatherInfo("2013-08-23", 20, 12, 4, 11, 7, 4, 100, 68, 37, 1024, 1023, 1022, 10, 10, 10, 14, 6, 0, 0.00f, 1, "", 9),
                    new WeatherInfo("2013-08-24", 20, 13, 6, 10, 7, 5, 100, 71, 37, 1025, 1024, 1023, 10, 8, 5, 11, 5, 0, 0.00f, 1, "", 90),
                    new WeatherInfo("2013-08-25", 22, 13, 5, 10, 7, 4, 100, 66, 35, 1024, 1023, 1022, 0, 0, 0, 14, 5, 0, 0.00f, 0, "", 54),
                    new WeatherInfo("2013-08-26", 22, 13, 6, 13, 8, 5, 100, 72, 33, 1024, 1023, 1022, 10, 10, 10, 13, 3, 0, 0.00f, 1, "", 287),
                    new WeatherInfo("2013-08-27", 22, 14, 8, 15, 11, 7, 100, 78, 50, 1022, 1021, 1018, 10, 8, 1, 14, 6, 0, 0.00f, 1, "Fog", 227),
                    new WeatherInfo("2013-08-28", 21, 17, 13, 16, 14, 12, 100, 82, 60, 1018, 1016, 1014, 10, 10, 10, 21, 10, 0, 0.00f, 2, "", 241),
                    new WeatherInfo("2013-08-29", 18, 12, 7, 11, 8, 4, 100, 74, 42, 1016, 1016, 1015, 10, 10, 1, 11, 5, 0, 0.00f, 2, "Fog", 52),
                    new WeatherInfo("2013-08-30", 18, 14, 10, 11, 9, 7, 100, 80, 63, 1016, 1015, 1015, 10, 10, 9, 21, 11, 0, 0.00f, 5, "Rain", 94),
                    new WeatherInfo("2013-08-31", 20, 15, 10, 13, 11, 8, 94, 81, 52, 1015, 1012, 1008, 10, 10, 10, 14, 10, 0, 0.00f, 3, "", 125),
                    new WeatherInfo("2013-09-01", 18, 12, 6, 15, 12, 6, 100, 88, 67, 1007, 1003, 1001, 10, 10, 8, 29, 11, 0, 0.00f, 5, "Rain", 178),
                    new WeatherInfo("2013-09-02", 15, 10, 6, 11, 8, 6, 100, 84, 63, 1006, 1001, 1000, 10, 9, 2, 26, 10, 0, 0.00f, 5, "Rain", 99),
                    new WeatherInfo("2013-09-03", 19, 13, 7, 12, 9, 6, 100, 81, 52, 1019, 1014, 1007, 10, 10, 10, 16, 8, 0, 0.00f, 2, "", 355),
                    new WeatherInfo("2013-09-04", 20, 13, 6, 14, 9, 6, 100, 84, 49, 1024, 1022, 1020, 10, 5, 0, 13, 3, 0, 0.00f, 2, "Fog", 308),
                    new WeatherInfo("2013-09-05", 20, 12, 5, 13, 9, 4, 100, 82, 52, 1025, 1024, 1023, 10, 8, 0, 14, 5, 0, 0.00f, 2, "Fog", 191),
                    new WeatherInfo("2013-09-06", 20, 13, 6, 14, 11, 6, 100, 86, 52, 1024, 1023, 1022, 10, 4, 0, 14, 6, 0, 0.00f, 2, "Fog", 181),
                    new WeatherInfo("2013-09-07", 21, 13, 6, 15, 11, 6, 100, 84, 53, 1025, 1024, 1023, 10, 7, 0, 16, 6, 0, 0.00f, 2, "Fog", 228),
                    new WeatherInfo("2013-09-08", 23, 14, 7, 15, 11, 7, 100, 81, 47, 1026, 1025, 1023, 10, 2, 0, 14, 5, 0, 0.00f, 2, "Fog", 253),
                    new WeatherInfo("2013-09-09", 22, 16, 9, 15, 12, 6, 100, 84, 38, 1023, 1021, 1019, 10, 4, 0, 13, 5, 0, 0.00f, 3, "Fog", 123),
                    new WeatherInfo("2013-09-10", 18, 16, 12, 14, 13, 11, 100, 87, 73, 1019, 1018, 1016, 10, 10, 10, 23, 14, 0, 0.00f, 6, "", 115),
                    new WeatherInfo("2013-09-11", 20, 16, 10, 15, 13, 10, 100, 90, 68, 1016, 1016, 1015, 10, 9, 0, 13, 8, 0, 0.00f, 4, "Fog", 147),
                    new WeatherInfo("2013-09-12", 20, 15, 9, 15, 12, 8, 100, 90, 56, 1017, 1017, 1016, 10, 3, 0, 10, 5, 0, 0.00f, 4, "Fog", 109),
                    new WeatherInfo("2013-09-13", 21, 13, 7, 14, 11, 7, 100, 86, 53, 1019, 1018, 1017, 10, 5, 0, 11, 5, 0, 0.00f, 1, "Fog", 128),
                    new WeatherInfo("2013-09-14", 20, 14, 9, 14, 9, 7, 100, 76, 43, 1019, 1018, 1017, 10, 8, 3, 16, 6, 0, 0.00f, 1, "Fog", 135),
                    new WeatherInfo("2013-09-15", 17, 11, 6, 11, 8, 6, 100, 81, 52, 1017, 1012, 1008, 10, 10, 8, 16, 11, 0, 0.00f, 3, "Fog", 133),
                    new WeatherInfo("2013-09-16", 16, 12, 9, 12, 9, 8, 100, 83, 59, 1008, 1003, 1001, 10, 10, 9, 24, 16, 42, 0.00f, 5, "Rain", 142),
                    new WeatherInfo("2013-09-17", 15, 13, 12, 13, 11, 9, 100, 90, 77, 1001, 1001, 1000, 10, 10, 8, 24, 16, 0, 0.00f, 6, "Rain", 131),
                    new WeatherInfo("2013-09-18", 14, 13, 12, 14, 12, 10, 100, 92, 82, 1000, 999, 997, 10, 10, 8, 27, 19, 0, 0.00f, 7, "Rain", 128),
                    new WeatherInfo("2013-09-19", 17, 16, 14, 15, 14, 13, 100, 95, 82, 1005, 1002, 1000, 10, 10, 10, 24, 19, 42, 0.00f, 7, "Rain", 126),
                    new WeatherInfo("2013-09-20", 17, 13, 9, 14, 13, 9, 100, 90, 72, 1010, 1007, 1005, 10, 9, 0, 19, 13, 0, 0.00f, 6, "Fog-Rain", 132),
                    new WeatherInfo("2013-09-21", 17, 11, 6, 13, 10, 6, 100, 87, 52, 1013, 1012, 1010, 10, 7, 0, 19, 6, 0, 0.00f, 5, "Fog-Rain", 311),
                    new WeatherInfo("2013-09-22", 15, 10, 6, 11, 7, 5, 100, 82, 51, 1011, 1006, 1001, 10, 8, 0, 24, 10, 42, 0.00f, 3, "Fog-Rain", 304),
                    new WeatherInfo("2013-09-23", 12, 9, 7, 9, 8, 6, 100, 90, 72, 1006, 1001, 998, 10, 10, 10, 21, 13, 35, 0.00f, 6, "Rain", 6),
                    new WeatherInfo("2013-09-24", 9, 6, 3, 6, 3, -1, 93, 78, 58, 1009, 1008, 1006, 10, 10, 10, 23, 11, 37, 0.00f, 5, "", 24),
                    new WeatherInfo("2013-09-25", 8, 2, -3, 2, -1, -5, 100, 74, 40, 1010, 1010, 1009, 10, 10, 10, 21, 10, 0, 0.00f, 2, "", 1),
                    new WeatherInfo("2013-09-26", 9, 3, -2, 5, 2, -3, 100, 87, 62, 1009, 1006, 1004, 10, 10, 10, 26, 13, 45, 0.00f, 4, "Rain", 334),
                    new WeatherInfo("2013-09-27", 11, 7, 3, 7, 5, 3, 100, 88, 62, 1010, 1006, 1004, 10, 10, 10, 11, 8, 0, 0.00f, 5, "Fog-Rain", 7),
                    new WeatherInfo("2013-09-28", 11, 6, 1, 5, 3, 1, 100, 87, 58, 1019, 1015, 1010, 10, 10, 10, 19, 10, 0, 0.00f, 4, "", 62),
                    new WeatherInfo("2013-09-29", 9, 6, 3, 5, 4, 2, 100, 85, 62, 1022, 1021, 1019, 10, 10, 10, 13, 6, 0, 0.00f, 5, "", 15),
                    new WeatherInfo("2013-09-30", 8, 6, 3, 4, -1, -4, 100, 69, 46, 1024, 1022, 1021, 10, 10, 10, 19, 10, 0, 0.00f, 4, "", 67),
                    new WeatherInfo("2013-10-01", 7, 1, -4, -1, -3, -5, 100, 67, 46, 1027, 1025, 1024, 10, 10, 10, 13, 6, 0, 0.00f, 3, "", 53),
                    new WeatherInfo("2013-10-02", 10, 2, -6, 4, -1, -7, 100, 86, 62, 1029, 1028, 1027, 10, 10, 10, 19, 6, 0, 0.00f, 4, "", 199),
                    new WeatherInfo("2013-10-03", 12, 6, 0, 6, 3, 0, 100, 84, 62, 1029, 1028, 1028, 2, 2, 2, 21, 8, 0, 0.00f, 0, "", 258),
                    new WeatherInfo("2013-10-04", 12, 7, 2, 7, 5, 2, 100, 80, 62, 1029, 1026, 1021, 10, 10, 10, 34, 11, 42, 0.00f, 4, "", 251),
                    new WeatherInfo("2013-10-05", 12, 11, 10, 11, 8, 7, 100, 83, 72, 1021, 1015, 1008, 10, 10, 5, 23, 16, 40, 0.00f, 6, "Rain", 234),
                    new WeatherInfo("2013-10-06", 13, 10, 7, 11, 9, 7, 100, 89, 67, 1014, 1012, 1008, 10, 10, 5, 19, 11, 0, 0.00f, 5, "Fog-Rain", 286),
                    new WeatherInfo("2013-10-07", 13, 9, 6, 11, 9, 6, 100, 93, 82, 1015, 1013, 1011, 10, 8, 0, 14, 10, 0, 0.00f, 3, "Fog", 266),
                    new WeatherInfo("2013-10-08", 13, 9, 6, 13, 11, 6, 100, 98, 94, 1016, 1014, 1011, 10, 8, 0, 11, 5, 0, 0.00f, 6, "Fog-Rain", 231),
                    new WeatherInfo("2013-10-09", 13, 12, 11, 12, 11, 11, 100, 95, 88, 1010, 1005, 1002, 10, 9, 3, 16, 11, 0, 0.00f, 8, "Rain", 242),
                    new WeatherInfo("2013-10-10", 13, 11, 9, 12, 11, 9, 100, 98, 88, 1019, 1010, 1004, 10, 9, 4, 11, 6, 0, 0.00f, 6, "Rain", 221),
                    new WeatherInfo("2013-10-11", 11, 7, 3, 9, 5, 2, 100, 88, 66, 1028, 1024, 1019, 10, 10, 1, 21, 8, 0, 0.00f, 4, "Fog-Rain", 335),
                    new WeatherInfo("2013-10-12", 13, 7, 0, 9, 5, 0, 100, 91, 72, 1030, 1029, 1027, 10, 5, 0, 16, 6, 0, 0.00f, 4, "Fog", 294),
                    new WeatherInfo("2013-10-13", 13, 9, 4, 8, 6, 2, 100, 87, 67, 1027, 1023, 1022, 10, 7, 1, 19, 10, 0, 0.00f, 3, "Fog", 357),
                    new WeatherInfo("2013-10-14", 11, 3, -3, 7, 1, -5, 100, 83, 50, 1025, 1022, 1015, 10, 10, 10, 13, 6, 0, 0.00f, 2, "", 159),
                    new WeatherInfo("2013-10-15", 9, 7, 5, 8, 6, 2, 93, 85, 76, 1015, 1009, 1006, 10, 10, 10, 23, 14, 0, 0.00f, 7, "", 299),
                    new WeatherInfo("2013-10-16", 6, 1, -4, 1, -3, -5, 93, 79, 49, 1012, 1010, 1007, 10, 10, 10, 11, 6, 0, 0.00f, 1, "", 41),
                    new WeatherInfo("2013-10-17", 6, 0, -5, 6, 2, -6, 100, 96, 86, 1011, 1004, 999, 10, 10, 7, 11, 6, 0, 0.00f, 7, "Rain", 134),
                    new WeatherInfo("2013-10-18", 4, 2, 0, 4, -1, -5, 100, 82, 52, 1009, 1002, 996, 10, 10, 10, 26, 14, 50, 0.00f, 6, "Rain", 4),
                    new WeatherInfo("2013-10-19", 6, 1, -3, 1, -2, -4, 100, 78, 57, 1013, 1010, 1008, 10, 10, 7, 35, 13, 61, 0.00f, 3, "Rain-Snow", 292),
                    new WeatherInfo("2013-10-20", 6, 0, -5, 0, -4, -6, 100, 82, 49, 1017, 1015, 1013, 10, 10, 10, 13, 3, 0, 0.00f, 2, "", 313),
                    new WeatherInfo("2013-10-21", 4, -2, -8, -2, -6, -9, 100, 83, 49, 1023, 1020, 1017, 10, 10, 10, 11, 3, 0, 0.00f, 1, "", 90),
                    new WeatherInfo("2013-10-22", 5, -2, -8, 3, -3, -9, 100, 84, 61, 1023, 1020, 1012, 10, 10, 7, 23, 11, 39, 0.00f, 4, "Rain-Snow", 138),
                    new WeatherInfo("2013-10-23", 11, 8, 5, 11, 9, 5, 100, 100, 93, 1011, 1003, 999, 10, 3, 1, 21, 16, 53, 0.00f, 8, "Fog-Rain", 216),
                    new WeatherInfo("2013-10-24", 12, 10, 9, 12, 9, 5, 100, 91, 71, 999, 997, 997, 10, 7, 1, 23, 11, 37, 0.00f, 6, "Fog-Rain", 239),
                    new WeatherInfo("2013-10-25", 10, 6, 0, 8, 5, 0, 100, 83, 58, 1012, 1005, 997, 10, 10, 7, 26, 19, 40, 0.00f, 7, "Rain", 292),
                    new WeatherInfo("2013-10-26", 11, 6, 1, 11, 7, 1, 100, 98, 93, 1012, 1002, 995, 10, 7, 1, 19, 8, 0, 0.00f, 8, "Fog-Rain", 200),
                    new WeatherInfo("2013-10-27", 11, 10, 9, 11, 10, 9, 100, 98, 94, 998, 996, 991, 10, 8, 1, 21, 13, 0, 0.00f, 7, "Fog", 232),
                    new WeatherInfo("2013-10-28", 11, 10, 9, 11, 9, 8, 100, 94, 87, 990, 985, 973, 10, 10, 2, 21, 14, 39, 0.00f, 7, "Fog-Rain", 223),
                    new WeatherInfo("2013-10-29", 11, 9, 8, 10, 8, 7, 100, 93, 82, 993, 984, 971, 10, 10, 6, 26, 18, 47, 0.00f, 8, "Rain", 269),
                    new WeatherInfo("2013-10-30", 8, 3, -2, 7, 3, -2, 100, 90, 71, 1010, 1002, 994, 10, 9, 1, 19, 13, 0, 0.00f, 4, "Fog-Rain", 285),
                    new WeatherInfo("2013-10-31", 9, 3, -3, 8, 3, -3, 100, 92, 71, 1013, 1010, 1007, 10, 9, 1, 21, 6, 35, 0.00f, 6, "Fog-Rain", 249),
                    new WeatherInfo("2013-11-01", 9, 8, 7, 8, 7, 5, 100, 92, 81, 1007, 1003, 1000, 10, 10, 4, 23, 13, 0, 0.00f, 7, "Rain", 248),
                    new WeatherInfo("2013-11-02", 9, 6, 1, 7, 5, 1, 100, 91, 81, 1001, 1000, 999, 10, 9, 0, 19, 11, 0, 0.00f, 6, "Fog-Rain", 252),
                    new WeatherInfo("2013-11-03", 6, 2, -1, 5, 3, -1, 100, 99, 93, 1000, 999, 993, 10, 7, 0, 24, 8, 0, 0.00f, 8, "Fog-Rain", 121),
                    new WeatherInfo("2013-11-04", 8, 7, 5, 7, 6, 5, 100, 98, 93, 992, 987, 986, 10, 10, 7, 21, 11, 0, 0.00f, 6, "Rain", 204),
                    new WeatherInfo("2013-11-05", 8, 7, 5, 7, 4, 2, 100, 90, 81, 987, 981, 975, 10, 10, 7, 37, 16, 64, 0.00f, 7, "Rain", 198),
                    new WeatherInfo("2013-11-06", 8, 6, 2, 5, 3, 1, 100, 87, 81, 994, 990, 986, 10, 10, 10, 14, 6, 0, 0.00f, 7, "Rain", 253),
                    new WeatherInfo("2013-11-07", 6, 4, 3, 4, 3, 2, 100, 92, 81, 997, 996, 995, 10, 10, 10, 8, 5, 0, 0.00f, 6, "Rain", 195),
                    new WeatherInfo("2013-11-08", 8, 6, 3, 6, 4, 2, 100, 90, 76, 1004, 999, 994, 10, 10, 8, 24, 10, 0, 0.00f, 7, "Rain", 250),
                    new WeatherInfo("2013-11-09", 8, 6, 3, 6, 5, 3, 100, 89, 81, 1007, 1003, 992, 10, 10, 10, 24, 11, 0, 0.00f, 6, "Rain", 195),
                    new WeatherInfo("2013-11-10", 7, 4, 3, 6, 4, 2, 100, 92, 87, 1009, 996, 989, 10, 10, 6, 26, 16, 45, 0.00f, 7, "Rain", 259),
                    new WeatherInfo("2013-11-11", 5, 1, -3, 3, -1, -3, 100, 89, 65, 1023, 1019, 1009, 10, 10, 10, 13, 6, 0, 0.00f, 4, "", 291),
                    new WeatherInfo("2013-11-12", 7, 4, 2, 7, 4, 0, 100, 87, 76, 1022, 1014, 1007, 10, 10, 6, 29, 14, 55, 0.00f, 7, "Rain", 245),
                    new WeatherInfo("2013-11-13", 7, 3, 0, 6, 3, 0, 100, 86, 76, 1010, 1007, 1006, 10, 10, 10, 24, 16, 0, 0.00f, 7, "", 272),
                    new WeatherInfo("2013-11-14", 6, 2, -1, 2, 1, -1, 100, 90, 76, 1018, 1014, 1010, 10, 10, 10, 13, 8, 0, 0.00f, 4, "", 269),
                    new WeatherInfo("2013-11-15", 7, 3, 0, 6, 4, 0, 100, 94, 87, 1019, 1014, 1004, 10, 10, 8, 26, 10, 35, 0.00f, 7, "Rain", 237),
                    new WeatherInfo("2013-11-16", 10, 8, 6, 6, 6, 5, 93, 89, 76, 1003, 1001, 997, 10, 10, 10, 23, 16, 0, 0.00f, 6, "Rain", 263),
                    new WeatherInfo("2013-11-17", 9, 4, 0, 5, -1, -5, 87, 63, 46, 1019, 1006, 996, 10, 10, 10, 42, 26, 69, 0.00f, 1, "", 306),
                    new WeatherInfo("2013-11-18", 8, 2, -3, 5, 1, -4, 100, 82, 66, 1019, 1014, 1006, 10, 10, 9, 21, 10, 40, 0.00f, 6, "Rain", 220),
                    new WeatherInfo("2013-11-19", 7, 6, 5, 6, 6, 5, 100, 95, 87, 1005, 1000, 998, 10, 9, 6, 16, 13, 37, 0.00f, 8, "Rain", 229),
                    new WeatherInfo("2013-11-20", 6, 3, 0, 5, 2, -1, 100, 95, 93, 1010, 1007, 1001, 10, 10, 1, 19, 8, 0, 0.00f, 5, "Fog-Rain", 66),
                    new WeatherInfo("2013-11-21", 7, 3, 1, 7, 2, 0, 100, 97, 87, 1010, 1007, 1005, 10, 7, 1, 26, 19, 0, 0.00f, 7, "Fog-Rain-Snow", 101),
                    new WeatherInfo("2013-11-22", 7, 4, 1, 7, 3, 0, 100, 96, 87, 1016, 1012, 1008, 10, 9, 1, 16, 6, 0, 0.00f, 7, "Fog-Rain", 296),
                    new WeatherInfo("2013-11-23", 3, 1, -1, 1, -1, -2, 100, 88, 75, 1016, 1012, 1004, 10, 10, 10, 21, 6, 0, 0.00f, 6, "", 242),
                    new WeatherInfo("2013-11-24", 2, 0, -2, 1, -2, -6, 100, 81, 60, 1009, 1005, 1002, 10, 10, 8, 24, 14, 0, 0.00f, 5, "Rain-Snow", 291),
                    new WeatherInfo("2013-11-25", 1, -2, -5, 0, -3, -7, 100, 86, 75, 1022, 1016, 1009, 10, 10, 10, 11, 6, 0, 0.00f, 5, "", 339),
                    new WeatherInfo("2013-11-26", 4, -3, -9, 1, -4, -10, 100, 87, 70, 1023, 1020, 1012, 10, 10, 8, 26, 6, 0, 0.00f, 4, "Rain", 261),
                    new WeatherInfo("2013-11-27", 7, 4, 2, 4, 3, 0, 100, 91, 66, 1012, 1003, 995, 10, 10, 9, 27, 18, 0, 0.00f, 5, "Rain", 270),
                    new WeatherInfo("2013-11-28", 6, 3, 2, 1, -2, -4, 87, 69, 57, 1002, 993, 989, 10, 10, 9, 35, 27, 55, 0.00f, 6, "Rain", 327),
                    new WeatherInfo("2013-11-29", 2, -3, -8, -5, -6, -9, 93, 78, 60, 1008, 1007, 1002, 10, 10, 10, 26, 13, 45, 0.00f, 4, "", 359),
                    new WeatherInfo("2013-11-30", 3, -2, -6, 1, -4, -8, 100, 81, 60, 1009, 1005, 1002, 10, 9, 3, 32, 10, 0, 0.00f, 5, "Rain-Snow", 259),
                    new WeatherInfo("2013-12-01", 4, 1, -2, 2, -2, -8, 100, 79, 60, 1009, 994, 986, 10, 10, 7, 34, 19, 61, 0.00f, 5, "Rain-Snow", 303),
                    new WeatherInfo("2013-12-02", 3, -2, -6, 0, -6, -10, 87, 71, 55, 1024, 1019, 1011, 10, 10, 10, 24, 14, 39, 0.00f, 4, "Rain-Snow", 297),
                    new WeatherInfo("2013-12-03", 5, 3, 2, 2, 1, -1, 87, 85, 81, 1015, 1008, 1005, 10, 10, 10, 23, 14, 0, 0.00f, 3, "", 281),
                    new WeatherInfo("2013-12-04", 2, -2, -5, -1, -2, -6, 100, 95, 81, 1009, 1002, 996, 10, 10, 9, 16, 3, 0, 0.00f, 4, "Fog", 268),
                    new WeatherInfo("2013-12-05", 2, 1, 0, 2, -1, -3, 100, 87, 70, 996, 986, 973, 10, 10, 6, 32, 13, 52, 0.00f, 6, "Rain-Snow", 227),
                    new WeatherInfo("2013-12-06", 2, 1, 0, 2, 1, 0, 100, 97, 93, 985, 975, 970, 10, 8, 2, 26, 14, 0, 0.00f, 8, "Rain-Snow", 93),
                    new WeatherInfo("2013-12-07", 0, -3, -7, 0, -3, -8, 100, 95, 86, 1004, 993, 985, 10, 9, 4, 14, 10, 0, 0.00f, 7, "Snow", 14),
                    new WeatherInfo("2013-12-08", -5, -6, -7, -6, -7, -8, 93, 90, 86, 1011, 1009, 1004, 10, 10, 8, 13, 6, 0, 0.00f, 8, "Snow", 33),
                    new WeatherInfo("2013-12-09", -5, -9, -13, -6, -8, -14, 93, 89, 80, 1029, 1019, 1010, 10, 10, 6, 16, 10, 0, 0.00f, 7, "Snow", 68),
                    new WeatherInfo("2013-12-10", 3, -6, -13, 3, -4, -14, 100, 96, 92, 1030, 1024, 1017, 10, 7, 1, 19, 8, 0, 0.00f, 7, "Fog-Rain-Snow", 212),
                    new WeatherInfo("2013-12-11", 3, 2, 1, 3, 2, 1, 100, 100, 100, 1018, 1017, 1015, 10, 2, 0, 16, 13, 0, 0.00f, 7, "Fog", 275),
                    new WeatherInfo("2013-12-12", 7, 3, 1, 6, 3, 0, 100, 94, 66, 1016, 1007, 993, 10, 5, 0, 47, 11, 69, 0.00f, 6, "Fog-Rain", 253),
                    new WeatherInfo("2013-12-13", 8, 2, -5, 2, -3, -6, 93, 73, 53, 1022, 1010, 992, 10, 10, 10, 58, 32, 97, 0.00f, 5, "Rain", 334),
                    new WeatherInfo("2013-12-14", -1, -4, -8, -3, -6, -9, 100, 90, 80, 1024, 1023, 1021, 10, 10, 6, 16, 5, 0, 0.00f, 4, "Snow", 135),
                    new WeatherInfo("2013-12-15", 5, 2, -1, 4, 2, -2, 100, 98, 93, 1020, 1015, 1012, 10, 7, 1, 19, 13, 39, 0.00f, 8, "Fog-Rain-Snow", 203),
                    new WeatherInfo("2013-12-16", 6, 4, 3, 6, 4, 2, 100, 98, 93, 1015, 1011, 1005, 10, 9, 2, 23, 13, 42, 0.00f, 8, "Fog-Rain", 243),
                    new WeatherInfo("2013-12-17", 7, 3, 1, 6, 2, 0, 100, 86, 70, 1013, 1007, 1002, 10, 10, 10, 34, 19, 60, 0.00f, 6, "", 273),
                    new WeatherInfo("2013-12-18", 3, 1, -1, 1, 0, -1, 100, 94, 81, 1019, 1017, 1013, 10, 9, 3, 11, 8, 0, 0.00f, 7, "Fog", 254),
                    new WeatherInfo("2013-12-19", 4, 3, 2, 3, 1, 0, 100, 90, 81, 1017, 1012, 1006, 10, 9, 2, 19, 11, 0, 0.00f, 8, "Fog-Rain-Snow", 180),
                    new WeatherInfo("2013-12-20", 5, 4, 3, 4, 3, 1, 100, 91, 81, 1010, 1007, 1004, 10, 9, 6, 24, 16, 34, 0.00f, 6, "Rain", 235),
                    new WeatherInfo("2013-12-21", 6, 4, 3, 4, 3, 0, 100, 90, 75, 1008, 1005, 1000, 10, 10, 7, 26, 16, 0, 0.00f, 7, "Rain", 253),
                    new WeatherInfo("2013-12-22", 6, 6, 5, 5, 3, 1, 100, 86, 70, 1001, 996, 992, 10, 10, 3, 34, 19, 58, 0.00f, 5, "Rain", 250),
                    new WeatherInfo("2013-12-23", 5, 3, 2, 4, 2, 0, 100, 87, 81, 999, 992, 990, 10, 10, 8, 29, 23, 48, 0.00f, 7, "Rain", 267),
                    new WeatherInfo("2013-12-24", 6, 3, 2, 5, 3, 0, 100, 93, 87, 1002, 997, 992, 10, 9, 3, 21, 14, 48, 0.00f, 7, "Rain", 210),
                    new WeatherInfo("2013-12-25", 6, 6, 5, 5, 4, 4, 100, 93, 87, 995, 993, 992, 10, 9, 5, 21, 16, 47, 0.00f, 8, "Rain", 202),
                    new WeatherInfo("2013-12-26", 6, 4, 4, 5, 4, 3, 100, 96, 87, 1004, 1000, 993, 10, 9, 2, 16, 11, 32, 0.00f, 6, "Fog", 210),
                    new WeatherInfo("2013-12-27", 6, 4, 3, 5, 3, 2, 100, 96, 81, 1004, 999, 996, 10, 6, 1, 24, 13, 42, 0.00f, 8, "Fog-Rain", 189),
                    new WeatherInfo("2013-12-28", 6, 6, 5, 5, 4, 2, 100, 96, 81, 998, 997, 996, 10, 9, 5, 23, 18, 47, 0.00f, 8, "Rain", 225),
                    new WeatherInfo("2013-12-29", 5, 3, 2, 5, 3, 2, 100, 95, 87, 1002, 1000, 997, 10, 10, 9, 14, 11, 0, 0.00f, 5, "", 226),
                    new WeatherInfo("2013-12-30", 4, 2, 0, 4, 1, -1, 100, 91, 81, 1016, 1008, 1001, 10, 10, 10, 23, 14, 0, 0.00f, 7, "Rain", 265),
                    new WeatherInfo("2013-12-31", 5, 3, 2, 3, 2, 1, 93, 88, 76, 1016, 1015, 1013, 10, 10, 10, 23, 14, 48, 0.00f, 7, "Rain", 241)
            );
        } catch (ParseException pe) {
            throw new RuntimeException("This should not happen!", pe);
        }
    }

    /**
     * @return Shoe size data for boys
     */
    public List<ShoeSizeInfo> getBoysData() {
        return boysData;
    }

    /**
     * @return Shoe size data for girls
     */
    public List<ShoeSizeInfo> getGirlsData() {
        return girlsData;
    }

    /**
     * @return Shoe size data for girls and boys
     */
    public List<ShoeSizeInfo> getData() {
        ArrayList<ShoeSizeInfo> data = new ArrayList<>(girlsData);
        data.addAll(boysData);
        return data;
    }

    /**
     * @return Daily weather data for Turku, Finland from 2013-1-6 to 2013-12-31
     */
    public List<WeatherInfo> getWeatherData() {
        return weatherData;
    }
}
