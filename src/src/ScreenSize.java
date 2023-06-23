import java.awt.*;

public enum ScreenSize {
    FullScreen {
        @Override
        public Dimension dim_Size() {
            DisplayMode gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
            return new Dimension(gd.getWidth(), gd.getHeight());
        }
    },
    HalfScreen {
        @Override
        public Dimension dim_Size() {
            DisplayMode gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
            return new Dimension(gd.getWidth() / 2, gd.getHeight() / 2);
        }
    },
    Minimize {
        @Override
        public Dimension dim_Size() {
            DisplayMode gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
            return new Dimension(gd.getWidth() / 8, gd.getHeight() / 8);
        }
    },
    Custom {
        @Override
        public Dimension dim_Size() {
            DisplayMode gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode();
            return new Dimension(gd.getWidth() / 3, gd.getHeight() / 3);
        }
    };


    public Dimension dim_Size() {
        return null;
    }
}

