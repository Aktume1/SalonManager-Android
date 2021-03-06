package com.framgia.fsalon.utils;

/**
 * Created by MyPC on 20/07/2017.
 */
public class Constant {
    public static final String END_POINT_URL = "http://fsalon.dinhtai.com/";
    public static final int OUT_OF_INDEX = -1;
    public static final long A_DAY = 1000 * 60 * 60 * 24;
    public static final String DATE_FORMAT_MM_DD_YYYY = "MM/dd/yyyy";
    public static final String DAY_OF_WEEK_FORMAT = "EEEE";
    public static final int FULL = 0;
    public static final int AVAILABLE = 1;
    public static final int OFF_WORK = 2;
    public static final String BUNDLE_ORDER = "BUNDLE_ORDER";
    public static final String BOOKING_ID = "BOOKING_ID";
    public static final int NO_SCROLL = -1;
    public static final String BUNDLE_USER = "BUNDLE_USER";
    public static final int FIRST_ITEM = 0;
    public static final String BUNDLE_BILL_ID = "BUNDLE_BILL_ID";
    public static final String EXTRA_CUSTOMER = "EXTRA_CUSTOMER";
    public static final String EXTRA_PERMISSION = "EXTRA_PERMISSION";

    public class ApiParram {
        public static final String DEPARTMENT_ID = "department_id";
        public static final String STYLIST_ID = "stylist_id";
        public static final String DATE = "date";
        public static final String PHONE = "phone";
        public static final String NAME = "name";
        public static final String RENDER_BOOKING_ID = "render_booking_id";
        public static final String STYLIST_CHOSEN = "stylist_chosen";
        public static final String PAGE = "page";
        public static final String PER_PAGE = "per_page";
        public static final String NON_FILTER = "null";
        public static final int OUT_OF_INDEX = -1;
        public static final int FIRST_PAGE = 1;
        public static final String CUSTOMER_ID = "customer_id";
        public static final String CUSTOMER_NAME = "customer_name";
        public static final String ORDER_BOOKING_ID = "order_booking_id";
        public static final String STATUS = "status";
        public static final String GRAND_TOTAL = "grand_total";
        public static final String BILL_ITEMS = "bill_items";
        public static final String TYPE_FILTER = "type";
        public static final String START_DATE = "start_date";
        public static final String END_DATE = "end_date";
        public static final String ID = "id";
        public static final String IMAGE = "images";
        public static final String POST_IMAGE = "images[]";
    }

    public class Permission {
        public static final int PERMISSION_NOMAL = 0;
        public static final int PERMISSION_ASSISTANT = 1;
        public static final int PERMISSION_MAIN_WORKER = 2;
        public static final int PERMISSION_ADMIN = 3;
    }

    /**
     * Define the value of request permission when running app
     */
    public class RequestPermission {
        public static final int REQUEST_ADMIN_BOOKING_ACTIVITY = 1;
        public static final int REQUEST_START_CUSTOMER_FILTER_ACTIVITY = 2;
        public static final int REQUEST_CALL_PERMISSION = 3;
        public static final int REQUEST_PERMISSION_CAMERA = 4;
        public static final int REQUEST_PICK_IMAGE = 5;
        public static final int REQUEST_PERMISSION_WRITE_STORGE = 6;
    }

    /**
     * Status for Bill
     */
    public class Status {
        public static final int STATUS_WAITING = 0;
        public static final int STATUS_COMPLETE = 1;
        public static final int STATUS_CANCEL = 2;
        public static final String WAITING = "Waiting";
        public static final String COMPLETE = "Complete";
        public static final String CANCEL = "Cancel";
    }

    /**
     * Bundle for report
     */
    public class Report {
        public static final String BUNDLE_TYPE = "Type";
        public static final String BUNDLE_START = "Start";
        public static final String BUNDLE_END = "End";
        public static final String BUNDLE_STATUS = "Status";
    }

    /**
     * Status for Booking
     */
    public class BookingStatus {
        public static final String BOOKING_STATUS = "BOOKING_STATUS";
        public static final String FINISHED = "Finished";
        public static final String WATTING = "Watting";
        public static final String CANCEL = "Cancel";
        public static final String NA = "N/A";
    }
}
