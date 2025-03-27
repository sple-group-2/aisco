#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.ayukdonate --module-path aisco.product.ayukdonate -m aisco.product.ayukdonate &

wait