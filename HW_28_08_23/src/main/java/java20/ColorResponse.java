package java20;

import lombok.Data;

@Data
public class ColorResponse {
        public ColorInfoResult result;
        public Status status;

}
@Data
class ColorInfoResult{
        public ColorPalette colors;

}
@Data
class ColorPalette{
        public ColorData[] background_colors;
        public ColorData[] foreground_colors;
        public ColorData[] image_colors;
}

class ColorData{
        public int r;
        public int g;
        public int b;
        public String closest_palette_color;
        public String closest_palette_color_parent;
        public double percent;

        @Override
        public String toString() {
                return
                        "closest_palette_color = " + closest_palette_color +
                        "\nclosest_palette_color_parent = " + closest_palette_color_parent +
                        "\npercent = " + percent +
                        "\n";
        }
}
@Data
class Status{
        public String text;
        public String type;
}

