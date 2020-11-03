package pt.pa.adts;

/**
 * TODO: Fornecer documentação da interface.
 *
 * @param <T>
 */
public interface Queue<T> {

    /**
     * Enqueues a new element in the queue.
     *
     * @param element The element to enqueue.
     * @throws FullQueueException When the queue is full.
     */
    void enqueue(T element) throws FullQueueException;

    /**
     * Dequeues the oldest element in the queue, according to the enqueuing order. The element is removed and returned.
     *
     * @return The oldest element in the queue.
     * @throws EmptyQueueException When the queue is empty.
     */
    T dequeue() throws EmptyQueueException;

    /**
     * Returns the oldest element in the queue, according to the enqueuing order. The element is not removed.
     *
     * @return The oldest element in the queue.
     * @throws EmptyQueueException When the queue is empty.
     */
    T front() throws EmptyQueueException;

    /**
     * Returns the number of elements in the queue.
     *
     * @return The queue size.
     */
    int size();

    /**
     * Indicates if the queue is empty.
     *
     * @return True if queue is empty, False if it isn't.
     */
    boolean isEmpty();

    /**
     * Clears the content of the queue.
     */
    void clear();
}
