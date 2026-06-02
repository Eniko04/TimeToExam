package Factory;

class ImpossibleTask implements Task {

    @Override
    public void solve() {
        System.out.println("Получена е непонятна задача.");
    }
}
