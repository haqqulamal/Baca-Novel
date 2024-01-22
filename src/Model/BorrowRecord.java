/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;
/**
 *
 * @author User
 */
public class BorrowRecord {
    private Member member;
    private ModelNovel novel;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private int fineAmount;

    public BorrowRecord(Member member, ModelNovel novel, LocalDate borrowDate, LocalDate dueDate) {
        this.member = member;
        this.novel = novel;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    // Getter dan Setter
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public ModelNovel getNovel() {
        return novel;
    }

    public void setNovel(Novel novel, ModelNovel ModelNovel) {
        this.novel = ModelNovel;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        this.fineAmount = fineAmount;
    }

    private static class Novel {

        public Novel() {
        }
    }
}
