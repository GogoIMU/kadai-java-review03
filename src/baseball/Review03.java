package baseball;

public class Review03 {

    public static void main(String[] args) {
        // チームを生成
        BaseBallTeam ya = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam be = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam ty = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam ja = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam ca = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam dr = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        ya.report();
        be.report();
        ty.report();
        ja.report();
        ca.report();
        dr.report();
    }
}
