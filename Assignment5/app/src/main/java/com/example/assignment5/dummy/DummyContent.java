package com.example.assignment5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(new DummyItem("1", "Computer", "$1,200.00", makeDetails(1)));
        addItem(new DummyItem("2", "Sofa", "$850.00", makeDetails(2)));
        addItem(new DummyItem("3", "Dishwasher", "$480.00", makeDetails(3)));
        addItem(new DummyItem("4", "Television", "$690.00", makeDetails(4)));
        addItem(new DummyItem("5", "Car", "$21,000.00", makeDetails(5)));
        addItem(new DummyItem("6", "Chair", "$40.00", makeDetails(6)));
        addItem(new DummyItem("7", "Painting", "$300.00", makeDetails(7)));
        addItem(new DummyItem("8", "Desk", "$140.00", makeDetails(8)));
        addItem(new DummyItem("9", "Toaster", "$40.00", makeDetails(9)));
        addItem(new DummyItem("10", "Fridge", "$700.00", makeDetails(10)));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        switch (position) {
            case 1:
                builder.append("Description of Computer:");
                builder.append("\n\nA high tech device for all your computing needs");
                break;
            case 2:
                builder.append("Description of Sofa:");
                builder.append("\n\nA comfortable place to sit");
                break;
            case 3:
                builder.append("Description of Dishwasher:");
                builder.append("\n\nCleans dishes with ease");
                break;
            case 4:
                builder.append("Description of Television:");
                builder.append("\n\nUsed for displaying shows and movies");
                break;
            case 5:
                builder.append("Description of Car:");
                builder.append("\n\nGreat way to get around");
                break;
            case 6:
                builder.append("Description of Chair:");
                builder.append("\n\nPerfect for sitting");
                break;
            case 7:
                builder.append("Description of Painting:");
                builder.append("\n\nA beautiful visual piece to stare at");
                break;
            case 8:
                builder.append("Description of Desk:");
                builder.append("\n\nA good work environment");
                break;
            case 9:
                builder.append("Description of Toaster:");
                builder.append("\n\nUsed for toasting food");
                break;
            case 10:
                builder.append("Description of Fridge:");
                builder.append("\n\nGood for keeping food cold and fresh");
                break;
            default:
                builder.append("Error loading description");
                builder.append("\n\n");
                break;
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String productName;
        public final String price;
        public final String details;

        public DummyItem(String id, String productName, String price, String details) {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.details = details;
        }

        @Override
        public String toString() {
            return (productName);
        }
    }
}