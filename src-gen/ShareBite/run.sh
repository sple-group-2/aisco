#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.sharebite --module-path aisco.product.sharebite -m aisco.product.sharebite &

wait