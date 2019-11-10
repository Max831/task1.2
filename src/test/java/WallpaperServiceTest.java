import org.junit.jupiter.api.Test;


class WallpaperServiceTest {

    @Test
    void countSheetForRoom() {
        System.out.println((int) Math.ceil(0.0/2.0));
        System.out.println((int) Math.ceil(0.0/0.0));
        System.out.println((int) Math.ceil(2.0/0.0));
        System.out.println((int) Math.ceil(-3.0/2));
    }

    @Test
    void countSheetInOneOfWallpaper() {
        System.out.println((int) Math.floor(0.0/2.0));
        System.out.println((int) Math.floor(0.0/0.0));
        System.out.println((int) Math.floor(2.0/0.0));
        System.out.println((int) Math.floor(-3.0/2));
    }

    @Test
    void rollsOfWallpaper() {
        System.out.println(0.0/2.0);
        System.out.println(0.0/0.0);
        System.out.println(4.0/0.0);
        System.out.println(-2.0/2.0);
        System.out.println(-1.0/0.0);

    }
}