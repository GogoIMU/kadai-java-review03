package baseball;

class BaseBallTeam {
    //  フィールド
    private String name; // チーム名
    private int win; // 勝ち数
    private int lose; // 負け数
    private int draw; // 引き分け数

    // 引数なしのコンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // getとかsetとか
    public String getName() {
        return name;
    }

    public void setName(String name, int i, int j, int k) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    // 勝率を引き出すメソッド
    public double getRate() {
        double rate = (double)win / (win + lose);
        return rate;
    }

    // 戦績出力メソッド
    public void report(){
        System.out.println(name + "の2022年の成績は" + this.win + "勝" + this.lose + "敗" + this.draw + "分、勝率は" + getRate() + "です。");
    }
}
