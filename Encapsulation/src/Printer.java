public class Printer {

    private int tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    public Printer (int tonerLevel, boolean duplex) {

        if (tonerLevel > -1 && tonerLevel <= 100) {

            this.tonerLevel = tonerLevel;
        } else {

            this.tonerLevel = -1;
        }

        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {

        if (tonerAmount > 0 && tonerAmount <= 100) {

            if ((this.tonerLevel + tonerAmount) > 100) {

                return -1;
            } else {

                this.tonerLevel = this.tonerLevel + tonerAmount;
                return this.tonerLevel;
            }
        } else {

            return -1;
        }
    }

    public int printPages (int pages) {

        int pagesToPrint = pages;

        if (this.duplex) {

            int remainder = pages % 2;
            int quotient = (pages - remainder) / 2;

            pagesToPrint = remainder + quotient;
        }

        this.pagesPrinted = this.pagesPrinted + pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted () {

        return pagesPrinted;
    }
}