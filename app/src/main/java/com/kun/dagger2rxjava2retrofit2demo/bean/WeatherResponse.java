package com.kun.dagger2rxjava2retrofit2demo.bean;

import java.util.List;

/**
 * Created by 坤 on 2017/8/17.
 */

public class WeatherResponse {

    /**
     * shidu : 48%
     * pm25 : 20.0
     * pm10 : 37.0
     * quality : 良
     * wendu : 33
     * ganmao : 极少数敏感人群应减少户外活动
     * yesterday : {"date":"16日星期三","sunrise":"06:03","high":"高温 35.0℃","low":"低温 28.0℃","sunset":"18:59","aqi":44,"fx":"无持续风向","fl":"<3级","type":"雷阵雨","notice":"空旷场地不要使用有金属尖端的雨伞"}
     * forecast : [{"date":"17日星期四","sunrise":"06:03","high":"高温 35.0℃","low":"低温 28.0℃","sunset":"18:58","aqi":36,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"18日星期五","sunrise":"06:03","high":"高温 35.0℃","low":"低温 28.0℃","sunset":"18:57","aqi":63,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"lovely sunshine，尽情享受阳光的温暖吧"},{"date":"19日星期六","sunrise":"06:04","high":"高温 36.0℃","low":"低温 27.0℃","sunset":"18:57","aqi":72,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"晴空万里，去沐浴阳光吧"},{"date":"20日星期日","sunrise":"06:04","high":"高温 36.0℃","low":"低温 27.0℃","sunset":"18:56","aqi":71,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"},{"date":"21日星期一","sunrise":"06:05","high":"高温 36.0℃","low":"低温 27.0℃","sunset":"18:55","aqi":68,"fx":"无持续风向","fl":"<3级","type":"晴","notice":"天气干燥，请适当增加室内湿度"}]
     */

    private String shidu;
    private double pm25;
    private double pm10;
    private String quality;
    private String wendu;
    private String ganmao;
    private YesterdayBean yesterday;
    private List<ForecastBean> forecast;

    public String getShidu() {
        return shidu;
    }

    public void setShidu(String shidu) {
        this.shidu = shidu;
    }

    public double getPm25() {
        return pm25;
    }

    public void setPm25(double pm25) {
        this.pm25 = pm25;
    }

    public double getPm10() {
        return pm10;
    }

    public void setPm10(double pm10) {
        this.pm10 = pm10;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public YesterdayBean getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayBean yesterday) {
        this.yesterday = yesterday;
    }

    public List<ForecastBean> getForecast() {
        return forecast;
    }

    public void setForecast(List<ForecastBean> forecast) {
        this.forecast = forecast;
    }

    public static class YesterdayBean {
        /**
         * date : 16日星期三
         * sunrise : 06:03
         * high : 高温 35.0℃
         * low : 低温 28.0℃
         * sunset : 18:59
         * aqi : 44.0
         * fx : 无持续风向
         * fl : <3级
         * type : 雷阵雨
         * notice : 空旷场地不要使用有金属尖端的雨伞
         */

        private String date;
        private String sunrise;
        private String high;
        private String low;
        private String sunset;
        private double aqi;
        private String fx;
        private String fl;
        private String type;
        private String notice;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public double getAqi() {
            return aqi;
        }

        public void setAqi(double aqi) {
            this.aqi = aqi;
        }

        public String getFx() {
            return fx;
        }

        public void setFx(String fx) {
            this.fx = fx;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }
    }

    public static class ForecastBean {
        /**
         * date : 17日星期四
         * sunrise : 06:03
         * high : 高温 35.0℃
         * low : 低温 28.0℃
         * sunset : 18:58
         * aqi : 36.0
         * fx : 无持续风向
         * fl : <3级
         * type : 晴
         * notice : lovely sunshine，尽情享受阳光的温暖吧
         */

        private String date;
        private String sunrise;
        private String high;
        private String low;
        private String sunset;
        private double aqi;
        private String fx;
        private String fl;
        private String type;
        private String notice;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getSunrise() {
            return sunrise;
        }

        public void setSunrise(String sunrise) {
            this.sunrise = sunrise;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getSunset() {
            return sunset;
        }

        public void setSunset(String sunset) {
            this.sunset = sunset;
        }

        public double getAqi() {
            return aqi;
        }

        public void setAqi(double aqi) {
            this.aqi = aqi;
        }

        public String getFx() {
            return fx;
        }

        public void setFx(String fx) {
            this.fx = fx;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getNotice() {
            return notice;
        }

        public void setNotice(String notice) {
            this.notice = notice;
        }
    }
}
