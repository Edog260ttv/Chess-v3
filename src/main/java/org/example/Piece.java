package org.example;

public class Piece {

    private String pieceType = "";
    private String color = "";
    private boolean isCausingCheck = false;

    public Piece() {

        pieceType = null;
        isCausingCheck = false;
        color = "white";

    }

    public Piece(String pT, String pieceColor) {

        pieceType = pT;
        color = pieceColor;
        isCausingCheck = false;

    }

    public Piece(String pT, boolean iCC, String pieceColor) {

        pieceType = pT;
        isCausingCheck = iCC;
        color = pieceColor;

    }

    public boolean isCausingCheck() {
        return isCausingCheck;
    }

    public String getPieceType() {

        return pieceType;

    }

    public static String getPiece(String color, String piece) {

        if (color.equals("white")) {

            if (piece.equals("pawn")) {

                return "♟";

            } else if (piece.equals("rook")) {

                return "♜";

            } else if (piece.equals("knight")) {

                return "♞";

            }  else if (piece.equals("bishop")) {

                return "♝";

            }  else if (piece.equals("king")) {

                return "♚";

            }  else if (piece.equals("queen")) {

                return "♛";

            }

        } else {

            if (piece.equals("pawn")) {

                return "♙";

            } else if (piece.equals("rook")) {

                return "♖";

            } else if (piece.equals("knight")) {

                return "♘";

            }  else if (piece.equals("bishop")) {

                return "♗";

            }  else if (piece.equals("king")) {

                return "♔";

            }  else if (piece.equals("queen")) {

                return "♕";

            }

        }

        return null;

    }
}
